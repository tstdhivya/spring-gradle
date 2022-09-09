package com.demo.demo102;

public class Student {
    private String id;
    private String fatherName;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String id, String fatherName, String name, int age) {
        this.id = id;
        this.fatherName = fatherName;
        this.name = name;
        this.age = age;
    }
}
