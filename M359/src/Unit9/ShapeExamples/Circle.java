package Unit9.ShapeExamples;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public String toString() {
        String str = "";
        str += getColor() + " " + getName() + " ";
        str += "with radius of " + radius;

        return str;
    }

    public double findArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getRadius() {
        return radius;
    }
}
