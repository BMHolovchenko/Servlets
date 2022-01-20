package model;

import Dao.interfaces.Identity;

import java.sql.Date;

public class ProjectInfo implements Identity {

    private Date date;
    private String project;
    private Integer developers;

    @Override
    public Long getId() {
        return null;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Integer getDevelopers() {
        return developers;
    }

    public void setDevelopers(Integer developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "date=" + date +
                ", project='" + project + '\'' +
                ", developers='" + developers + '\'' +
                '}';
    }
}
