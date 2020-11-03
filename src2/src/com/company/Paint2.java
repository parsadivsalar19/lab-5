package com.company;

import java.util.ArrayList;

public class Paint2 {
    static ArrayList<Shape> shapes ;


    public static void main(String[] args) {
        shapes = new ArrayList<>();
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);
        Shape tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);
        Shape tri3 = new Triangle(4,4,6);
        Paint2 paint = new Paint2();
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rect1);
        paint.addShape(rect2);
        paint.addShape(rect3);
        paint.addShape(tri1);
        paint.addShape(tri2);
        paint.drawAll();
        paint.printAll();
        paint.describeEqualSides();
       // System.out.println(tri1.equals(tri2));
       // System.out.println(tri2.equals(tri3));
       // System.out.println(rect3.equals(tri3));

    }
    public void drawAll() {
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public void printAll() {
        for (Shape s : shapes) {
            System.out.println(s);
        }

    }

    public void addShape(Shape s){
        shapes.add(s);
    }

    public void describeEqualSides(){
        for (Shape s : shapes) {
            if(s instanceof Rectangle){
                if(((Rectangle) s).isSquare())
                System.out.println(s);
            }else if(s instanceof Triangle)
                if(((Triangle) s).isEquilateral())
                    System.out.println(s);
        }
    }

}
