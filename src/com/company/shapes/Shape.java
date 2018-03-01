package com.company.shapes;

public class Shape {

    private int x;
    private int y;

    private String displayName;

    public Shape(int x, int y, String displayName) {
        this.x = x;
        this.y = y;
        this.displayName = displayName;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDisplayName() {
        return displayName.toUpperCase();
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    @Override
    public String toString() {
        return String.format("X: %s, Y: %s, Display Name: %s", x, y, displayName);
//        return "X: " + x  + ", Y: " + y + ", Display Name: " + displayName;
    }
}
