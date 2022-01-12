package U7_ArrayLists.examples;

import java.util.ArrayList;

public class U7_1_notes {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("popcorn");
        words.add("words");
        words.add("January");
        words.add(1, "and");
        words.set(2, "hot cocoa");
        words.add(3, "in");

        System.out.println(words);

        //traverse the AL with a regular for loop
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i) + " ");
        }

        System.out.println();

        //traverse the AL with a for each loop
        for(String s: words) {
            System.out.print(s + " ");
        }

        System.out.println();

        //print sentence backwards
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.print(words.get(i) + " ");
        }
    }
}
