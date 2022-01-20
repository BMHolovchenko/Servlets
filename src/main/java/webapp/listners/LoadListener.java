package webapp.listners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import service.*;

@WebListener
public class LoadListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("developerService", new DeveloperService());
        servletContext.setAttribute("companyService", new CompanyService());
        servletContext.setAttribute("customerService", new CustomerService());
        servletContext.setAttribute("projectService", new ProjectService());
        servletContext.setAttribute("skillService", new SkillService());
        servletContext.setAttribute("salaryService", new SalaryService());
        servletContext.setAttribute("projectDeveloperService", new ProjectDeveloperService());
        servletContext.setAttribute("javaDeveloperService", new JavaDeveloperService());
        servletContext.setAttribute("middleDeveloperService", new MiddleDeveloperService());
        servletContext.setAttribute("projectInfoService", new ProjectInfoService());
    }
}
