package service;

import Dao.JavaDeveloperDao;
import model.JavaDeveloper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class JavaDeveloperService {

    private static JavaDeveloperService instance;
    private static final Logger LOGGER = LogManager.getLogger(JavaDeveloperService.class);
    private static final JavaDeveloperDao dao = JavaDeveloperDao.getInstance();

    public static JavaDeveloperService getInstance() {
        if (instance == null) {
            instance = new JavaDeveloperService();
        }
        return instance;
    }

    public List<JavaDeveloper> getAll() {
        return JavaDeveloperDao.getInstance().getAll();
    }
}
