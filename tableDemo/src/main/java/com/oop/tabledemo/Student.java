package com.oop.tabledemo;

public class Student {
    private String fullName;
    private String major;
    private Float cgpa;

    public Student(String major, String fullName, Float cgpa) {
        this.major = major;
        this.fullName = fullName;
        this.cgpa = cgpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }
}
