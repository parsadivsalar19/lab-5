package com.company;

public class Rectangle extends Polygon {

    public Rectangle(double... sides) {
        super(sides);
    }

    public boolean isSquare() {
        for (double side1 : sides) {
            for (double side2 : sides) {
                if (side1 != side2) {
                    return false;
                }
            }
        }
        return true;
    }

    public double calculatePerimeter() {
        return super.calculatePerimeter();
    }

    public double calculateArea() {
        return Math.min(sides.get(0), sides.get(1)) * Math.max(sides.get(2), sides.get(3));
    }

    public void draw() {
        String shape_type = "Rectangle";
        if (isSquare()) {
            shape_type = "Square";
        }
        System.out.println("Shape type : " + shape_type + "\nPerimeter : " + calculatePerimeter() + "\nArea : " + calculateArea());
    }

    public String toString(){
        String shape_type = "Rectangle";
        if (isSquare()) {
            shape_type = "Square";
        }
        return "Shape type : " + shape_type + "\n" +super.toString() ;
    }

}
