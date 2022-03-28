package com.techelevator;

public class SquareWall extends RectangleWall {

    private int sideLength;

    public SquareWall(String name, String color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return getSideLength() * getSideLength();
    }

    @Override
    public String toString() {
        return this.getName() + " (" + getSideLength() + "x" + getSideLength() + ") square";
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

}
