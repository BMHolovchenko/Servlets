package service;

import Dao.SalaryDao;
import model.Salary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SalaryService {

    private static SalaryService instance;
    private static final Logger LOGGER = LogManager.getLogger(SalaryService.class);
    private static final SalaryDao dao = SalaryDao.getInstance();

    public static SalaryService getInstance() {
        if (instance == null) {
            instance = new SalaryService();
        }
        return instance;
    }

    public List<Salary> getAll() {
        return SalaryDao.getInstance().getAll();
    }
}