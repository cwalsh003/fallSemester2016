package Problem3;

/**
 * Created by cwalsh on 9/25/16.
 */
public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public String showArea() {
        return "Circle{" +
                "area=" + area() +
                '}';
    }
}
