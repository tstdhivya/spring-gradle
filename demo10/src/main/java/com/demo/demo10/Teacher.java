package com.demo.demo10;

public class Teacher {
    private String id;
    private String name;
    private String location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Teacher(String id, String name, String location, int salary, int age) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
    }



}
