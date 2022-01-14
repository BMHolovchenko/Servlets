package Dao;

import model.Project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ProjectDao extends AbstractDao <Project> {

    private static ProjectDao instance;

    public static ProjectDao getInstance() {
        if (instance == null) {
            instance = new ProjectDao();
        }
        return instance;
    }

    @Override
    String getTableName() {
        return "projects";
    }

    @Override
    Project mapToEntity(ResultSet resultSet) throws SQLException {
        Project project = new Project();
        project.setId(resultSet.getLong("id"));
        project.setName(resultSet.getString("name"));
        project.setDescription(resultSet.getString("description"));
        project.setDate(resultSet.getDate("date"));
        return project;
    }

    @Override
    public Optional<Project> create(Project project) {
        String sql = "insert into projects (name, description, date) values (?, ?, ?)";
        DbHelper.executeWithPreparedStatement(sql, ps -> {
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setDate(3, project.getDate());
        });
        System.out.println("Record was created.");
        return Optional.empty();
    }

    @Override
    public void update(Project project) {
        String sql = "update projects set name = ?, description = ?, date = ? where id = ?";
        DbHelper.executeWithPreparedStatement(sql, ps -> {
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setDate(3, project.getDate());
            ps.setLong(4, project.getId());
        });
        System.out.println("Record was updated.");
    }
}