package com.oop.mvcdemo;

public class Student {
    private String name;
    private String major;
    private float cgpa;

    public Student(String objName, String objMajor, float objCgpa) {
        this.name = objName;
        this.major = objMajor;
        this.cgpa = objCgpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return this.cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}


