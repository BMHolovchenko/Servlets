package Dao;

import model.Project;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Optional;

public class ProjectDao extends AbstractDao <Project> {

    private static ProjectDao instance;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

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
        project.setDate(Date.valueOf(dateFormat.format(resultSet.getDate("date"))));
        project.setCost(resultSet.getInt("cost"));
        return project;
    }

    @Override
    public Optional<Project> create(Project project) {
        String sql = "insert into projects (name, description, date, cost) values (?, ?, ?, ?)";
        DbHelper.executeWithPreparedStatement(sql, ps -> {
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setDate(3, Date.valueOf(dateFormat.format(project.getDate())));
            ps.setInt(4, project.getCost());
        });
        System.out.println("Record was created.");
        return Optional.empty();
    }

    @Override
    public void update(Project project) {
        String sql = "update projects set name = ?, description = ?, date = ?, cost = ? where id = ?";
        DbHelper.executeWithPreparedStatement(sql, ps -> {
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setDate(3, Date.valueOf(dateFormat.format(project.getDate())));
            ps.setInt(4, project.getCost());
            ps.setLong(5, project.getId());
        });
        System.out.println("Record was updated.");
    }
}