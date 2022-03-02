package Unit9.ShapeExamples;

public class Square extends Rectangle{
    public Square(String name, String color, double side) {
        super(name, color, side, side);
    }

    public String toString() {
        String str = "";
        str += getColor() + " " + getName();
        str += " with side length of " + getWidth();

        return str;
    }
}
