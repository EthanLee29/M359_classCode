package U2_CreatingClasses.examples;

import java.util.Scanner;

public class WaterBottleTester {
    public static void main(String[] args) {

        WaterBottle ethanBlueBottle = new WaterBottle(24, 1);
        // max and current are the formal parameters
        // 24 and 1 are actual parameters

        WaterBottle ethanPurpleBottle = new WaterBottle(40, 40);
        // max and current are formal parameters
        // 40 and 40 are the actual parameters

        WaterBottle gatoradeBottle = new WaterBottle(32, 16);

        WaterBottle myNewBottle = new WaterBottle(64);

        // call methods
        myNewBottle.fillBottle();
        gatoradeBottle.drinkWater(5);
        myNewBottle.drinkWater(3);
        ethanPurpleBottle.setCurrOunces(20);

        //Must have an object in front of my method call
        // setCurrOunces(30); error

        // create a scanner object that will allow us to interact with the user at the keyboard

        Scanner input = new Scanner(System.in);

        // prompt user for info to create a new waterbottle
        System.out.println("What is your name? (one word)");
        String name = input.nextLine(); //read in their name they typed
        int bottleSize = input.nextInt(); // read in ounce size for bottle

        WaterBottle myBottle = new WaterBottle(bottleSize);
        System.out.println("Hi " + name);
        System.out.println("Your water bottle holds " + myBottle.getMaxOunces() + "of water");
        System.out.println("How much water is in your bottle?");
        int currWater = input.nextInt();
        myBottle.setCurrOunces(currWater); //update current water ounces
        System.out.println("Your water bottle currently holds " + myBottle.getCurrOunces() + " ounces of water");

        
    }
}
