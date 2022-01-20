package webapp.servlets.extended;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Salary;
import service.SalaryService;

import java.io.IOException;
import java.util.List;

@WebServlet("/salaries")
public class SalaryServlet extends HttpServlet {

    private SalaryService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            List<Salary> all = service.getAll();
            Object[] salaries = all.toArray();
            req.setAttribute("salaries", salaries);
            req.getRequestDispatcher("/jsp/salaries.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        this.service = (SalaryService) getServletContext().getAttribute("salaryService");
    }
}