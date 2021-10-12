package sef.module6.activity;

import java.sql.SQLOutput;

public class AbstractionActivity {

    public static void main (String[] args) {
        Shape square = new Square (5);
        square.setColor("red");

        System.out.println("--------Square info");
        System.out.println("Area of the square is " + square.calculateArea());
        System.out.println("Perimeter of the square is "+ square.calculatePerimeter());
        System.out.println("Color of the square is " + square.getColor());

        Shape rectangle = new Rectangle(5, 6);
        rectangle.setColor("green");
        System.out.println("\n\n-----Rectangle info");
        System.out.println("Area of the rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle is "+ rectangle.calculatePerimeter());
        System.out.println("Color of the rectangle is " + rectangle.getColor());

    }

}
