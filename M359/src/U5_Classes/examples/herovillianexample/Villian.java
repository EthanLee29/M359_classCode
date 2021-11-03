package U5_Classes.examples.herovillianexample;

public class Villian {
    private String name;
    private Power superPower;
    private static int numVillians = 0;
    private static double totalStrength = 0;

    public Villian(String name, Power superPower) {
        this.name = name;
        this.superPower = superPower;
        numVillians++;
        totalStrength += superPower.getStrength();
    }

    public String toString() {
        return "Villian " + name + " has the " + superPower.getName() + " power with " +
                superPower.getStrength() + " strength.";
    }

    // changeAmount represents a pos or neg amount that is add/subt to power strength
    public void updatePowerStrength(double changeAmount) {
        // get strength of the power and add changeAmount to it and save it back into power
        //strength var
        double currPower = superPower.getStrength();
        superPower.setStrength(currPower + changeAmount);
        totalStrength += changeAmount;
    }

    /**
     * This method will calculate the average strength of the villians by finding
     * totalStrength / numVillians
     * @return average strength per villian
     */
    public static double getAverageStrength() {
        return (double) totalStrength / numVillians;
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
        totalStrength -= this.superPower.getStrength();
        totalStrength += superPower.getStrength();

        this.superPower = superPower;
    }

    public static int getNumVillians() {
        return numVillians;
    }

    public static double getTotalStrength() {
        return totalStrength;
    }
}

