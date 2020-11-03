package paint;

import java.util.ArrayList;

public class Triangle {

    ArrayList<Double> sides;

    public Triangle(double side1, double side2, double side3) {
        sides = new ArrayList();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Double> sides) {
        this.sides = sides;
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
        double p = 0;
        for (double side : sides) {
            p += side;
        }
        return p;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangle other = (Triangle) obj;

        return this.sides.equals(other.sides);
    }

    public String toString() {
        String shape_type = "Triangle";
        if (isEquilateral()) {
            shape_type = "Equilateral";
        }

        return "Shape type : " + shape_type + "\nSides : " + getSides().toString();
    }

}
