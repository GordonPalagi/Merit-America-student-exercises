package com.techelevator;

public class RectangleWall extends Wall {

    private int height;
    private int length;


    // constructor with super from Wall class
    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.height = height;
        this.length = length;
    }

    public RectangleWall(String name, String color) {
        super(name, color);
    }


    // abstract method overrides from Wall class
    @Override
    public int getArea() {
        return length * height;
    }


    // method
    @Override
    public String toString() {
        return getName() + " (" + getLength() + "x" + getHeight() + ") " + "rectangle";
    }


    // getters and setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

