package model;

import Dao.interfaces.Identity;

public class JavaDeveloper implements Identity {

    private String developer;
    private Integer age;
    private String gender;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "developer='" + developer + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
