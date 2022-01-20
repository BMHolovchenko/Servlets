package service;

import Dao.JavaDeveloperDao;
import Dao.MiddleDeveloperDao;
import model.MiddleDeveloper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MiddleDeveloperService {

    private static MiddleDeveloperService instance;
    private static final Logger LOGGER = LogManager.getLogger(MiddleDeveloperService.class);
    private static final JavaDeveloperDao dao = JavaDeveloperDao.getInstance();

    public static MiddleDeveloperService getInstance() {
        if (instance == null) {
            instance = new MiddleDeveloperService();
        }
        return instance;
    }

    public List<MiddleDeveloper> getAll() {
        return MiddleDeveloperDao.getInstance().getAll();
    }
}

