
package paint;

public class Circle {
   private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   
     public double calculatePerimeter() {
        return 2 * Math.PI * radius ;
    }

    public double calculateArea() {
        return Math.PI * radius * radius  ;
    }

    public void draw() {
        System.out.println("Shape type : Circle" + "\nPerimeter : " + calculatePerimeter() + "\nArea : " + calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;

        return this.radius == other.radius;
    }

    public String toString() {
 
        return "Shape type : Circle" + "\nRadius : " + radius ;
    }

}
