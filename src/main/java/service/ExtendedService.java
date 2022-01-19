package service;

import Dao.ExtendedDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;


public class ExtendedService {

    private static ExtendedService instance;
    private static final Logger LOGGER = LogManager.getLogger(ExtendedService.class);
    private static final ExtendedDao dao = ExtendedDao.getInstance();


    public static ExtendedService getInstance() {
        if (instance == null) {
            instance = new ExtendedService();
        }
        return instance;
    }

    public void getProjectSalaries(String params) throws SQLException {
        dao.getProjectSalaries(params);
    }

    public void getDevelopersByProject (String params) throws SQLException {
        dao.getDevelopersByProject(params);
    }

    public void getJavaDevelopers() throws SQLException {
        dao.getJavaDevelopers();
    }

    public static void getProjectsInfo() throws SQLException {
        dao.getProjectsInfo();
    }
}