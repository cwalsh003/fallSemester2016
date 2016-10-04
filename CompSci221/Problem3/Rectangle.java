package Problem3;

/**
 * Created by cwalsh on 9/25/16.
 */
public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String showArea() {
        return "Rectangle {" +
                "area=" + area();
    }

    public double area (){
        return length * width;
    }
}