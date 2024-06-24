package com.oop.midterm_2111652_sec1;

public class RegisteredCourse {
    private String courseId;
    private int courseCredit;
    private int section;

    public RegisteredCourse(int courseCredit, String courseId, int section) {
        this.courseCredit = courseCredit;
        this.courseId = courseId;
        this.section = section;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Course: " + this.courseId + ", Credit: " + this.courseCredit + ", Section: " + this.section;
    }
}
