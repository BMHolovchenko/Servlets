package Dao;

import model.ProjectInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ProjectInfoDao extends AbstractDao<ProjectInfo>{

    private static ProjectInfoDao instance;

    public static ProjectInfoDao getInstance() {
        if (instance == null) {
            instance = new ProjectInfoDao();
        }
        return instance;
    }
    @Override
    String getTableName() {
        return "projects_info";
    }

    @Override
    ProjectInfo mapToEntity(ResultSet resultSet) throws SQLException {
        ProjectInfo projectInfo = new ProjectInfo();
        projectInfo.setDate(resultSet.getDate("date"));
        projectInfo.setProject(resultSet.getString("project"));
        projectInfo.setDevelopers(resultSet.getInt("developers"));
        return projectInfo;
    }

    @Override
    public Optional<ProjectInfo> create(ProjectInfo entity) {
        return Optional.empty();
    }

    @Override
    public void update(ProjectInfo entity) {
    }
}
