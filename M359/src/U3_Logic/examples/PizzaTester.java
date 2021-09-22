package U3_Logic.examples;

public class PizzaTester {
    public static void main(String[] args) {
        Pizza meatLovers = new Pizza("Domino's", 9, 5, false);
        Pizza deepCheese = new Pizza("Lou Malnatti's", 12, true);
        Pizza pep = new Pizza("Pizza Hut", 12, 1, false);

        System.out.println(meatLovers.getStore());
        System.out.println(meatLovers);
        // the toString method is automatically called for us when we print
        // the variable reference

        System.out.println(deepCheese);

        System.out.println(meatLovers.equals(deepCheese));
        System.out.println(pep.equals(deepCheese));

        System.out.println(meatLovers.compareTo(deepCheese));
        System.out.println(deepCheese.compareTo(pep));
        System.out.println(pep.compareTo(meatLovers));
    }
}
