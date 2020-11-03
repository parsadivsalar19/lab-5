package com.company;

import java.util.ArrayList;

public class Polygon extends Shape {
    ArrayList<Double> sides;

    public Polygon(double... sides) {
        this.sides = new ArrayList<>();
        for(double side : sides)
            this.sides.add(side);
    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Polygon other = (Polygon) obj;

        return this.sides.equals(other.sides);
    }

    public double calculatePerimeter() {
        double p = 0;
        for (double side : sides) {
            p += side;
        }
        return p;
    }

    public String toString() {
        String result = "";
        for(int i=0;i<sides.size();i++)
            result += "side" + (i+1) + ":" + sides.get(i) + ", " ;

        return result.substring(0,result.length()-2);
    }

}
