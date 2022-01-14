package Dao;

import config.DataSourceHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExtendedDao {

    private static final Logger LOGGER = LogManager.getLogger(ExtendedDao.class);
    private static ExtendedDao instance;

    public static ExtendedDao getInstance() {
        if (instance == null) {
            instance = new ExtendedDao();
        }
        return instance;
    }

    public void getProjectSalaries(String params) throws SQLException {
        Connection connection = DataSourceHolder.getDataSource().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("select sum(salary) as salaries from developers \n"
                        + "inner join developers_projects on developers.id = developers_projects.developer_id \n"
                        + "inner join projects on developers_projects.project_id = projects.id \n"
                        + "where projects.name = '"
                        + params + "';");

        while (resultSet.next()) {
            LOGGER.info("Salaries sum: " + resultSet.getString(1));
        }
        connection.close();
    }

    public void getDevelopersByProject(String params) throws SQLException {
        Connection connection = DataSourceHolder.getDataSource().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("select developers.name from developers \n"
                        + "inner join developers_projects on developers_projects.developer_id = developers.id \n"
                        + "inner join projects on developers_projects.project_id = projects.id \n"
                        + "where projects.name = '" + params + "';");

        while (resultSet.next()) {
            LOGGER.info("Developer: " + resultSet.getString(1));
        }
        connection.close();
    }

    public static void getJavaDevelopers() throws SQLException {
        Connection connection = DataSourceHolder.getDataSource().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("select developers.name from developers \n"
                        + "inner join developers_skills on developers_skills.developer_id = developers.id \n"
                        + "inner join skills on developers_skills.skill_id = skills.id \n"
                        + "where skills.name = 'Java'");
        while (resultSet.next()) {
            LOGGER.info("Java developer: " + resultSet.getString(1));
        }
        connection.close();
    }

    public static void getMiddleDevelopers() throws SQLException {
        Connection connection = DataSourceHolder.getDataSource().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("select developers.name from developers \n"
                        + "inner join developers_skills on developers_skills.developer_id = developers.id \n"
                        + "inner join skills on developers_skills.skill_id = skills.id \n"
                        + "where skills.level = 'Middle'");
        while (resultSet.next()) {
            LOGGER.info("Middle developer: " + resultSet.getString(1));
        }
        connection.close();
    }

    public static void getProjectsInfo() throws SQLException {
        Connection connection = DataSourceHolder.getDataSource().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("select projects.date, projects.name, count(developers_projects.developer_id) from projects \n"
                        + "inner join developers_projects on developers_projects.project_id = projects.id \n"
                        + "group by projects.date, projects.name");
        while (resultSet.next()) {
            LOGGER.info("Project : " + resultSet.getString(1) + " "
                    + resultSet.getString(2) + " "
                    + resultSet.getString(3));
        }
        connection.close();
    }
}