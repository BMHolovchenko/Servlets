package Dao;

import model.Salary;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class SalaryDao extends AbstractDao <Salary>{

    private static SalaryDao instance;

    public static SalaryDao getInstance() {
        if (instance == null) {
            instance = new SalaryDao();
        }
        return instance;
    }

    @Override
    String getTableName() {
        return "salaries";
    }

    @Override
    Salary mapToEntity(ResultSet resultSet) throws SQLException {
        Salary salary = new Salary();
        salary.setName(resultSet.getString("name"));
        salary.setSalaries(resultSet.getInt("salaries"));
        return salary;
    }

    @Override
    public Optional<Salary> create(Salary entity) {
        return Optional.empty();
    }

    @Override
    public void update(Salary entity) {
    }
}
