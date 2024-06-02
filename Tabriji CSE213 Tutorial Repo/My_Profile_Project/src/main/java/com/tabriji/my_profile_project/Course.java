package com.tabriji.my_profile_project;

public class Course {
    private String courseName;
    private String courseCode;
    private String courseTime;
    private int sectionNum;
    private String labCode;
    private String labTime;
    private String courseType;
    private String facultyName;
    private int capacity;

    public Course(String courseType, String courseName, String courseCode, String courseTime, int sectionNum, String labCode, String labTime, String facultyName, int capacity) {
        this.courseType = courseType;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseTime = courseTime;
        this.sectionNum = sectionNum;
        this.labCode = labCode;
        this.labTime = labTime;
        this.facultyName = facultyName;
        this.capacity = capacity;
    }

    public Course(String courseName, String courseCode, String courseTime, int sectionNum, String courseType, String facultyName, int capacity) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseTime = courseTime;
        this.sectionNum = sectionNum;
        this.courseType = courseType;
        this.facultyName = facultyName;
        this.capacity = capacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public int getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getLabTime() {
        return labTime;
    }

    public void setLabTime(String labTime) {
        this.labTime = labTime;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Course: " +
                "Course Name= " + courseName + '\'' +
                ", Course Code= " + courseCode + '\'' +
                ", Course Time= " + courseTime + '\'' +
                ", Section Number= " + sectionNum +
                ", Lab Code= " + labCode + '\'' +
                ", Lab Time= " + labTime + '\'' +
                ", Course Type= " + courseType + '\'' +
                ", Faculty Name= " + facultyName + '\'' +
                ", Capacity= " + capacity;
        // Team
    }
}
