package U2_CreatingClasses.examples.quizPractice;

public class Toy {
    // instance vars
    private String color;
    private int size;
    private boolean isPlastic;

    // default constructor - takes NO parameters and has default "generic" values

    public Toy() {
        color = "red";
        size = 5;
        isPlastic = true;
    }

    // constructor with parameters

    public Toy(String aColor, int aSize, boolean p) {
        color = aColor;
        size = aSize;
        isPlastic = p;
    }

    // getter and setter methods
    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public boolean getPlastic() {
        return isPlastic;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setSize(int newSize) {
        size = newSize;
    }

    public void setPlastic(boolean newPlastic) {
        isPlastic = newPlastic;
    }

    // print out the Toy info
    public void printToyData() {
        System.out.println("Color:\t\t\t" + color);
        System.out.println("Size:\t\t\t" + size);
        System.out.println("Is plastic:\t\t" +isPlastic);
    }
}
