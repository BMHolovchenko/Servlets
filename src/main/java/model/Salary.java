package model;

import Dao.interfaces.Identity;

public class Salary implements Identity {

    private String name;
    private Integer salaries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalaries() {
        return salaries;
    }

    public void setSalaries(Integer salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "name='" + name + '\'' +
                ", salaries=" + salaries +
                '}';
    }

    @Override
    public Long getId() {
        return null;
    }
}
