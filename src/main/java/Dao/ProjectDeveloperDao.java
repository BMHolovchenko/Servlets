package Dao;

import model.ProjectDeveloper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ProjectDeveloperDao extends AbstractDao<ProjectDeveloper>{

    private static ProjectDeveloperDao instance;

    public static ProjectDeveloperDao getInstance() {
        if (instance == null) {
            instance = new ProjectDeveloperDao();
        }
        return instance;
    }

    @Override
    String getTableName() {
        return "developers_by_project";
    }

    @Override
    ProjectDeveloper mapToEntity(ResultSet resultSet) throws SQLException {
        ProjectDeveloper projectDeveloper = new ProjectDeveloper();
        projectDeveloper.setProject(resultSet.getString("project"));
        projectDeveloper.setDeveloper(resultSet.getString("developer"));
        return projectDeveloper;
    }

    @Override
    public Optional<ProjectDeveloper> create(ProjectDeveloper entity) {
        return Optional.empty();
    }

    @Override
    public void update(ProjectDeveloper entity) {

    }
}
