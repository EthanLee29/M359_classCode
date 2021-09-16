package U2_CreatingClasses.examples;

public class WaterBottle {
    // declare private instance variables
    // this means that no one outside of this object can access these variable values
    // every method inside this class can access these variable values

    private int maxOunces;
    private int currOunces;

    /*
    Create a constructor that will give instructions on how to create a WaterBottle object.
    This constructor has the SAME NAME as the class and NO return type (not even void)
    We are allowed to have more than one constructor, however they must have different
    parameter lists.
    Must be public so that objects (i.e. WaterBottles) can be created
     */

    public WaterBottle(int max, int current) {
        maxOunces = max;
        currOunces = current;
    }

    // this is another constructor that represents an empty bottle
    public WaterBottle(int max) {
        maxOunces = max;
        currOunces = 0;
    }

    // this won't work
    /* public WaterBottle(int max, int desired) {

    }*/

    /*
    Create set methods that allow us to access the value of private instance variables. Normally,
     we cannot change these values in any other .java files. We can only change them using the set methods.
     */

    public void setCurrOunces(int newWaterAmt) {
        currOunces = newWaterAmt;
    }

    public void drinkWater(int amt) {
        currOunces -= amt;
    }

    public void fillBottle() {
        currOunces = maxOunces;
    }

    /*
    These are get methods that allow us to get the value of the private instance variables
     */

    public int getMaxOunces() {
        return maxOunces;
    }

    public int getCurrOunces() {
        return currOunces;
    }


}
