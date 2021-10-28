package U5_Classes.examples.herovillianexample;

public class Power {
    private String name;
    private double strength;

    public Power(String name, double strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public double getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(double strength) {
        this.strength = strength;
        if (strength < 1) {
            this.strength = 0;
        }
    }
}
