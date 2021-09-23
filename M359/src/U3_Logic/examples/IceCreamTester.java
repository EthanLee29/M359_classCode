package U3_Logic.examples;

public class IceCreamTester {
    public static void main(String[] args) {
        IceCream bob = new IceCream("Rocky Road", 3, true);
        IceCream sha = new IceCream("Mint Chip", 2, false);
        IceCream aubrey = new IceCream("Mint Chip", 2, false);
        IceCream riley = bob;

        // How many variable references have I made?
        // 4
        // How many objects have I instantiated?
        // 3
        // Write in comments what you think the output would be THEN run
        // the code to see if you are correct
        System.out.println(bob.equals(sha));        //false
        System.out.println(aubrey.equals(sha));     //true
        System.out.println(bob.equals(riley));      //true
        System.out.println(aubrey == sha);          //false
        System.out.println(riley == bob);           //true

        System.out.println(bob.compareTo(sha));     //1
        System.out.println(aubrey.compareTo(bob));  //-1
        System.out.println(aubrey.compareTo(sha));  //0
    }
}
