package sef.module6.activity;

public class Rectangle extends Shape {
    //Attributes
    private double length;
    private double width;

    //Behavior - default constructor
    Rectangle() { length = 0; width = 0; }

    //Behavior - parametrized constructor
    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
        }

    public double calculateArea() {
        double area = length * width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }


}
