package service;

import Dao.ProjectDeveloperDao;
import model.ProjectDeveloper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ProjectDeveloperService {

    private static ProjectDeveloperService instance;
    private static final Logger LOGGER = LogManager.getLogger(ProjectDeveloperService.class);
    private static final ProjectDeveloperDao dao = ProjectDeveloperDao.getInstance();

    public static ProjectDeveloperService getInstance() {
        if (instance == null) {
            instance = new ProjectDeveloperService();
        }
        return instance;
    }

    public List<ProjectDeveloper> getAll() {
        return ProjectDeveloperDao.getInstance().getAll();
    }
}