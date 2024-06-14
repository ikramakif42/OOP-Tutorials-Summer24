package com.oop.tabledemo;

public class DummyStudent {
    private String fullName;
    private String major;
    private Float cgpa;
    private boolean hasScholarship;

    public DummyStudent(String fullName, boolean hasScholarship, Float cgpa, String major) {
        this.fullName = fullName;
        this.hasScholarship = hasScholarship;
        this.cgpa = cgpa;
        this.major = major;
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

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }
}
