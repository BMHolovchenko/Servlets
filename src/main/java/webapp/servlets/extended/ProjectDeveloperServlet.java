package webapp.servlets.extended;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ProjectDeveloper;
import service.ProjectDeveloperService;

import java.io.IOException;
import java.util.List;

@WebServlet("/projectDevelopers")
public class ProjectDeveloperServlet extends HttpServlet {

    private ProjectDeveloperService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProjectDeveloper> all = service.getAll();
        Object[] projectDevelopers = all.toArray();
        req.setAttribute("projectDevelopers", projectDevelopers);
        req.getRequestDispatcher("/jsp/projectDevelopers.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        this.service = (ProjectDeveloperService) getServletContext().getAttribute("projectDeveloperService");
    }
}