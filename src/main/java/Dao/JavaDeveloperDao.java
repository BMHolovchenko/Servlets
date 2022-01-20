package Dao;

import model.JavaDeveloper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class JavaDeveloperDao extends AbstractDao<JavaDeveloper> {

    private static JavaDeveloperDao instance;

    public static JavaDeveloperDao getInstance() {
        if (instance == null) {
            instance = new JavaDeveloperDao();
        }
        return instance;
    }

    @Override
    String getTableName() {
        return "java_developers";
    }

    @Override
    JavaDeveloper mapToEntity(ResultSet resultSet) throws SQLException {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.setDeveloper(resultSet.getString("developer"));
        javaDeveloper.setAge(resultSet.getInt("age"));
        javaDeveloper.setGender(resultSet.getString("gender"));
        return javaDeveloper;
    }

    @Override
    public Optional<JavaDeveloper> create(JavaDeveloper entity) {
        return Optional.empty();
    }

    @Override
    public void update(JavaDeveloper entity) {
    }
}