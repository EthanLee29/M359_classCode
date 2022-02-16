package U8_2dArrays.NotesExamples;

public class Array2D_Practice {
    public static void main(String[] args) {
        // Make an array with 5 rows and two columns to represent 5 ordered pairs
        int[][] points = new int[5][2];

        fillPointsOnLine(4, 3, points);
        printPointsArr(points);
    }

    /**
     * This method will generate points with x values of -2. -1, 0, 1, 2
     *
     * @param m slope
     * @param b y intercept
     * @param arr to contain x, y values
     */
    public static void fillPointsOnLine(int m, int b, int[][] arr) {
        //build in safety check for a 2 col array
        if (arr[0].length != 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            // set x value
            arr[i][0] = i - 2;      // x values start at -2 and go to 2
            // set y value
            arr[i][1] = m * arr[i][0] + b;  // apply y = mx + b to get y value
        }
    }

    public static void printPointsArr(int[][] arr) {
        // want each ordered pair to print as (x, y)
        // (arr[i][0], arr[i][1])

        for(int i = 0; i < arr.length; i++) {
            System.out.println("(" + arr[i][0] + ", " + arr[i][1] + ")");
        }
    }
}
