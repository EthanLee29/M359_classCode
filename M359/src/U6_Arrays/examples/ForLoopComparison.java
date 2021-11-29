package U6_Arrays.examples;

public class ForLoopComparison {
    public static void main(String[] args) {
        int[] myNums = {3, 0, 18, 18, 27};
        String[] favMovies;
        favMovies = new String[5];
        favMovies[0] = "Cars";
        favMovies[1] = "Jumanji";
        favMovies[2] = "Endgame";
        favMovies[3] = "Whiplash";
        favMovies[4] = "Coraline";

        for (int i = 0; i < myNums.length; i++) {
            System.out.print(myNums[i] + " ");
        }
        for (int i = 0; i < favMovies.length; i++) {
            System.out.println(favMovies[i]);
        }

        for (int i: myNums) {
            System.out.print(i + " ");
        }

        for (String s: favMovies) {
            System.out.println(s);
        }
    }
}
