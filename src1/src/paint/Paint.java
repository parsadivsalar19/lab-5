package paint;

import java.util.ArrayList;

public class Paint {

    ArrayList<Triangle> triangles = new ArrayList();
    ArrayList<Rectangle> rectangles = new ArrayList();
    ArrayList<Circle> circles = new ArrayList();

    public static void main(String[] args) {
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1, 4, 1, 4);
        Rectangle rect2 = new Rectangle(8, 5, 8, 5);
        Rectangle rect3 = new Rectangle(6, 6, 6, 6);
        Triangle tri1 = new Triangle(2, 2, 2);
        Triangle tri2 = new Triangle(4, 4, 6);
        Paint paint = new Paint();
        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rect3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);
        paint.drawAll();
        System.out.println();
        paint.printAll();
    }
    
    public void addCircle(Circle c){
        circles.add(c);
    }
    
    public void addRectangle(Rectangle r){
        rectangles.add(r);
    }
    
    public void addTriangle(Triangle t){
        triangles.add(t);
    }

    public void drawAll() {
        for (Triangle t : triangles) {
            t.draw();
        }

        for (Rectangle r : rectangles) {
            r.draw();
        }

        for (Circle c : circles) {
            c.draw();
        }
    }

    public void printAll() {
        for (Triangle t : triangles) {
            System.out.println(t);
        }

        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

        for (Circle c : circles) {
            System.out.println(c);
        }

    }

}
