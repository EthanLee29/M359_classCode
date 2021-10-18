package U4_Loops.lab;

import java.util.Locale;

public class PigLatin {

    public static String translateWordToPigLatin (String str) {
        String translated = "";
        int counter = 0;
        if(ruleCheck(str, 0) == 1) {
            translated = str + "yay";
        } else if (ruleCheck(str, 0) == 0) {
            translated = str.substring(1) + "yay";
        } else {
            while (ruleCheck(str, counter) == -1) {
                counter++;
            }
            translated = str.substring(counter) + str.substring(0, counter) + "ay";
        }
        return translated;
    }

    public static String toPigLatin (String str) {
        String result = "";
        int indexOfLastSpace = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result += translateWordToPigLatin(str.substring(indexOfLastSpace + 1, i));
                indexOfLastSpace = i;
                result += " ";
            }
        }
        result += translateWordToPigLatin((str.substring(indexOfLastSpace + 1)));
        result = result.toLowerCase();
        result = result.substring(0, 1).toUpperCase() + result.substring(1);
        return result;
    }

    public static int ruleCheck (String str, int num) {
        boolean a = str.substring(num, num + 1).equalsIgnoreCase("a");
        boolean e = str.substring(num, num + 1).equalsIgnoreCase("e");
        boolean i = str.substring(num, num + 1).equalsIgnoreCase("i");
        boolean o = str.substring(num, num + 1).equalsIgnoreCase("o");
        boolean u = str.substring(num, num + 1).equalsIgnoreCase("u");
        if (a || e || i || o || u) {
            return 1;
        } else if (str.substring(num, num + 1).equalsIgnoreCase("y")) {
            return 0;
        } else {
            return -1;
        }
    }
}