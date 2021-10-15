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
s        return translated;
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
        if (str.charAt(num) == 'a' || str.charAt(num) == 'e' || str.charAt(num) == 'i' || str.charAt(num) == 'o' ||
        str.charAt(num) == 'u') {
            return 1;
        } else if (str.charAt(num) == 'y') {
            return 0;
        } else {
            return -1;
        }
    }
}
