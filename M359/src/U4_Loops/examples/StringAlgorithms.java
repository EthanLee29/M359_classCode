package U4_Loops.examples;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i += 2) {
            System.out.print(mySchool.charAt(i));
        }
        System.out.println("");

        // print the String mySchool in reverse (all characters on the same line)
        for(int i = mySchool.length() - 1; i >= 0; i--) {
            System.out.print(mySchool.charAt(i));
        }

        System.out.println("");


         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        String animalOut = "";
        for(int i = 0; i < animal.length(); i++) {
            animalOut += animal.charAt(i);
            System.out.println(animalOut);
        }


        System.out.println("");


        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?
        int counter = 0;
        for(int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == 'l') {
                if(phrase.substring(i, i + 6).equals("little")) {
                    counter++;
                }
            }
        }
        System.out.println("the word \"little\" appears in phrase " + 4 + " times.");

        // create a new String, or modify the existing String, that removes
        // the word "little" entirely

        String newPhrase = "";
        for(int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == 'l') {
                if(phrase.substring(i, i + 6).equals("little") == false) {
                    newPhrase += phrase.charAt(i);
                }
            }
        }



        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"




    }
}
