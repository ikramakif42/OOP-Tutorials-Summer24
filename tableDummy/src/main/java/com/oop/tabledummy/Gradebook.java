package com.oop.tabledummy;

public class Gradebook {
    private int id;
    private float cgpa;

    public Gradebook(int id, float cgpa) {
        this.id = id;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
