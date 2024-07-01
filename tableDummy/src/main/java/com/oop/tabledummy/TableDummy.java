package com.oop.tabledummy;

public class TableDummy {
    private int id;
    private String name;
    private float cgpa;

    public TableDummy(int id, float cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
