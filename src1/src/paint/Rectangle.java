package paint;

import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {

    private ArrayList<Double> sides;

    public Rectangle(double side1, double side2, double side3, double side4) {
        sides = new ArrayList();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);

    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Double> sides) {
        this.sides = sides;
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
        double p = 0;
        for (double side : sides) {
            p += side;
        }
        return p;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;

        return this.sides.equals(other.sides);
    }
    
    public String toString(){
    String shape_type = "Rectangle";
        if (isSquare()) {
            shape_type = "Square";
        }
        
        return "Shape type : " + shape_type + "\nSides : " + getSides().toString() ;
    }
    

}
