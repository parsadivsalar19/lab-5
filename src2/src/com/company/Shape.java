package com.company;

public class Shape {
    public double calculatePerimeter() {
         return 0 ;
    }

    public double calculateArea() {
        return 0 ;
    }

    public void draw() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shape other = (Shape) obj;

        return true;
    }
    public String toString(){
        return "Shape" ;
    }

}
