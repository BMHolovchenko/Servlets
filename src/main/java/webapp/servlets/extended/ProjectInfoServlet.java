package webapp.servlets.extended;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ProjectInfo;
import service.ProjectInfoService;

import java.io.IOException;
import java.util.List;

@WebServlet("/projectsInfo")
public class ProjectInfoServlet extends HttpServlet {

    private ProjectInfoService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProjectInfo> all = service.getAll();
        Object[] projectsInfo = all.toArray();
        req.setAttribute("projectsInfo", projectsInfo);
        req.getRequestDispatcher("/jsp/projectsInfo.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        this.service = (ProjectInfoService) getServletContext().getAttribute("projectInfoService");
    }
}