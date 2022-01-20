package webapp.servlets.extended;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.JavaDeveloper;
import service.JavaDeveloperService;

import java.io.IOException;
import java.util.List;

@WebServlet("/javaDevelopers")
public class JavaDeveloperServlet extends HttpServlet {

    private JavaDeveloperService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<JavaDeveloper> all = service.getAll();
        Object[] javaDevelopers = all.toArray();
        req.setAttribute("javaDevelopers", javaDevelopers);
        req.getRequestDispatcher("/jsp/javaDevelopers.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        this.service = (JavaDeveloperService) getServletContext().getAttribute("javaDeveloperService");
    }
}