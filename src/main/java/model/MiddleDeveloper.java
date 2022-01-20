package model;

import Dao.interfaces.Identity;

public class MiddleDeveloper implements Identity {

    private String developer;
    private String skill;

    @Override
    public Long getId() {
        return null;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "MiddleDeveloper{" +
                "developer='" + developer + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
