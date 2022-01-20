package model;

import Dao.interfaces.Identity;

public class ProjectDeveloper implements Identity {

    private String project;
    private String developer;

    @Override
    public Long getId() {
        return null;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "ProjectDeveloper{" +
                "project='" + project + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }
}
