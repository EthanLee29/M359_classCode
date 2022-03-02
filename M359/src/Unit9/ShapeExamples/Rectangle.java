package Unit9.ShapeExamples;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    //You could partially override where you call the toString method inside the toString
    public String toString() {
        String str = "";
        str += getColor() + " " + getName() + " sides of ";
        str += width + " by " + height;

        return str;
    }

    public void scaleSize(double scale) {
        width = width * scale;
        height = height * scale;
    }

    public double findArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }
}
