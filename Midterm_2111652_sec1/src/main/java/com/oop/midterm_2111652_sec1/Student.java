package com.oop.midterm_2111652_sec1;

public class Student {
    private int studentid;
    private boolean hasScholarship;
    private int scholarshipRate;

    public Student(boolean hasScholarship, int studentid, int scholarshipRate) {
        this.hasScholarship = hasScholarship;
        this.studentid = studentid;
        this.scholarshipRate = scholarshipRate;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(int scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }

    @Override
    public String toString() {
        return "Student ID: " + this.studentid + "," + " Scholarship: " + this.hasScholarship + "," + this.scholarshipRate
                + "%," + " Tuition fee per credit: 6000 Tk";
    }
}
