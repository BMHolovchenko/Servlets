package webapp.servlets.extended;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.MiddleDeveloper;
import service.MiddleDeveloperService;

import java.io.IOException;
import java.util.List;

@WebServlet("/middleDevelopers")
public class MiddleDeveloperServlet extends HttpServlet {

    private MiddleDeveloperService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MiddleDeveloper> all = service.getAll();
        Object[] middleDevelopers = all.toArray();
        req.setAttribute("middleDevelopers", middleDevelopers);
        req.getRequestDispatcher("/jsp/middleDevelopers.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        this.service = (MiddleDeveloperService) getServletContext().getAttribute("middleDeveloperService");
    }
}