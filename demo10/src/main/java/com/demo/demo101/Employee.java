package com.demo.demo101;

public class Employee {
    private String id;
    private String name;
    private int workingHours;
    private int salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    private int yearOfJoining;

    public Employee(String id, String name, int workingHours, int salary, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.workingHours = workingHours;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }
}
