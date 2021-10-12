package sef.module6.activity;

public class Square extends Shape{
    //Attributes
    private double side;

    //Behavior - default constructor
    Square() { side = 0; }


    //Behavior - parametrized constructor
    Square (double side) {
        this.side = side;
    }

    public double calculateArea() {
        double area = side * side;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }










    }
