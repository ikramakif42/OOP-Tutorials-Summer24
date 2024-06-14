package com.oop.studentinfo;

public class Student extends Person {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private int id;
    private String major;
    private String gender;
    private boolean hasScholarship;

    public Student(String firstName, String lastName, String gender, boolean hasScholarship, String major, int id) {
        super(firstName, lastName);
        this.gender = gender;
        this.hasScholarship = hasScholarship;
        this.major = major;
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name=" + this.getFirstName() + " " + this.getLastName() +
                ", id=" + id +
                ", major='" + major + '\'' +
                ", gender='" + gender + '\'' +
                ", hasScholarship=" + hasScholarship +
                '}';
    }
}
