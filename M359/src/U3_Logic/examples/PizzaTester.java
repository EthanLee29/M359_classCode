package U3_Logic.examples;

public class PizzaTester {
    public static void main(String[] args) {
        Pizza meatLovers = new Pizza("Domino's", 9, 5, false);
        Pizza deepCheese = new Pizza("Lou Malnatti's", 12, true);

        System.out.println(meatLovers.getStore());
        System.out.println(meatLovers);
        // the toString method is automatically called for us when we print
        // the variable reference

        System.out.println(deepCheese);

    }
}
