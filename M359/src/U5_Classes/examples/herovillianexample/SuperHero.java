package U5_Classes.examples.herovillianexample;

public class SuperHero {
    private String name;
    private Power superPower;

    public String toString() {
        return "SuperHero " + name + " has the " + superPower.getName() + " power with " +
                superPower.getStrength() + " strength.";
    }

    public SuperHero(String name, Power superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    // changeAmount represents a pos or neg amount that is add/subt to power strength
    public void updatePowerStrength(double changeAmount) {
        // get strength of the power and add changeAmount to it and save it back into power
        //strength var
        double currPower = superPower.getStrength();
        superPower.setStrength(currPower + changeAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
