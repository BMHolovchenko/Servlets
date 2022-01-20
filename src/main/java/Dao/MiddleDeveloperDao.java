package Dao;

import model.MiddleDeveloper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class MiddleDeveloperDao extends AbstractDao<MiddleDeveloper>{

    private static MiddleDeveloperDao instance;

    public static MiddleDeveloperDao getInstance() {
        if (instance == null) {
            instance = new MiddleDeveloperDao();
        }
        return instance;
    }

    @Override
    String getTableName() {
        return "middle_developers";
    }

    @Override
    MiddleDeveloper mapToEntity(ResultSet resultSet) throws SQLException {
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.setDeveloper(resultSet.getString("developer"));
        middleDeveloper.setSkill(resultSet.getString("skill"));
        return middleDeveloper;
    }

    @Override
    public Optional<MiddleDeveloper> create(MiddleDeveloper entity) {
        return Optional.empty();
    }

    @Override
    public void update(MiddleDeveloper entity) {
    }
}