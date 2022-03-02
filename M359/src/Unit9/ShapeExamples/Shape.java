package Unit9.ShapeExamples;

public class Shape {
    private String color, name;

    public Shape(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public String toString() {
        String str = "";
        str += color + " " + name;

        return str;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
