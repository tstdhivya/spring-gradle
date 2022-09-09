package com.example.demo8.employee;

public class Staff {
    private String id;
    private String name;
    private String location;
    private  int age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




    public Staff(String id, String name, String location, int age, int salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.age = age;
        this.salary = salary;
    }



}
