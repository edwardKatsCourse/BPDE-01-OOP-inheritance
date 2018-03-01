package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Shape;
import com.company.shapes.Square;

import java.util.Arrays;

public class SomeClass {

    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(Arrays.toString(args));
        int i = 0;

        SomeClass someClass = new SomeClass();
        Shape shape = new Shape(0, 10, "Abstract shape");

        Circle circle = new Circle(1, 10, "Circle", 11);

        ;


        System.out.println(shape.toString());


        System.out.println("---------------------------------------------------------------");
        System.out.println(shape.getY());
        System.out.println(circle.getY());

        Shape s1 = new Circle(1, 10, "Something", 1);
        System.out.println(s1.getDisplayName());

        Shape s2 = new Square(123, 3, "square");
        System.out.println(s2.getDisplayName());

        Shape[] shapes = new Shape[2];

        shapes[0] = s1;
        shapes[1] = s2;





    }

    public SomeClass() {
    }
}
