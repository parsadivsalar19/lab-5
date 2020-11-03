package com.company;

public class Triangle extends Polygon {
    public Triangle(double... sides) {
        super(sides);
    }

    public boolean isEquilateral() {
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
        double p = calculatePerimeter()/2 ;
        return Math.sqrt(p * (p-sides.get(0)) * (p-sides.get(1)) * (p-sides.get(2))) ;
    }

    public void draw() {
        String shape_type = "Triangle";
        if (isEquilateral()) {
            shape_type = "Equilateral";
        }
        System.out.println("Shape type : " + shape_type + "\nPerimeter : " + calculatePerimeter() + "\nArea : " + calculateArea());
    }

    public String toString(){
        String shape_type = "Triangle";
        if (isEquilateral()) {
            shape_type = "Equilateral";
        }
        return "Shape type : " + shape_type + "\n" +super.toString() ;
    }

}
