package org.example.calculator;

public class Model {  //instead of model let's assume Car

    // class veriable , class attributes, class field, class member
    String colour;
    int model;
    int registerNumber;
    int price;

    // They are two type of constructor 1. Default constructor 2. paramitterized


    public Model() {

    }

    public Model(String colour){
        this.colour = colour;
    }

    public  Model (String colour, int model){
        this.colour = colour;
        this.model = model;

    }

    public Model (int price,String colour){
        this.colour = colour;
        this.price= price;
    }

    // class method or function
    public String print_(){
        return colour+model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "model{" +
                "colour=" + colour +
                ", model=" + model +
                ", registerNumber=" + registerNumber +
                ", price=" + price +
                '}';
    }


}
