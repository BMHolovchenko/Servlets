package service;

import Dao.ProjectInfoDao;
import model.ProjectInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ProjectInfoService {

    private static ProjectInfoService instance;
    private static final Logger LOGGER = LogManager.getLogger(ProjectInfoService.class);
    private static final ProjectInfoDao dao = ProjectInfoDao.getInstance();

    public static ProjectInfoService getInstance() {
        if (instance == null) {
            instance = new ProjectInfoService();
        }
        return instance;
    }

    public List<ProjectInfo> getAll() {
        return ProjectInfoDao.getInstance().getAll();
    }
}