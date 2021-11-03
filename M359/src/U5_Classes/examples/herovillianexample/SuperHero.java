package U5_Classes.examples.herovillianexample;

public class SuperHero {
    private String name;
    private Power superPower;
    private static int numHeroes = 0; //static variables are initialized when declared
    private static double totalStrength = 0; //static variable will be used to accumulate the current TOTAL
                                            //of all heroes in creation

    public String toString() {
        return "SuperHero " + name + " has the " + superPower.getName() + " power with " +
                superPower.getStrength() + " strength.";
    }

    public SuperHero(String name, Power superPower) {
        this.name = name;
        this.superPower = superPower;
        numHeroes++; //update the amount of Heroes we have made in TOTAL
        totalStrength += superPower.getStrength();
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
     * This method will calculate the average strength of the heroes by finding
     * totalStrength / numHeroes
     * @return average strength per hero
     */
    public static double getAverageStrength() {
        return (double) totalStrength / numHeroes;
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
        //before we update the new power, we need to updated the totalStrength static var
        //subtract the old strength from the totalStrength var and then add the strength
        //of the new superPower var.

        totalStrength -= this.superPower.getStrength();
        totalStrength += superPower.getStrength();

        this.superPower = superPower;
    }

    public static int getNumHeroes() {
        return numHeroes;
    }

    public static double getTotalStrength() {
        return totalStrength;
    }
}