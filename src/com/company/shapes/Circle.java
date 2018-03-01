package com.company.shapes;

public class Circle extends Shape {

    private int radius;
    private int y;

    public Circle(int x, int y, String displayName, int radius) {
        super(x, y, displayName);
        this.radius = radius;
        this.y = y * 2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getY() {
        int a, b, c, y = 1;
        return this.y;
    }
}
