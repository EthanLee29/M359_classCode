package U7_ArrayLists.examples;

import java.util.ArrayList;

public class Notes_7_6_SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(4);
        myNums.add(2);
        myNums.add(7);
        myNums.add(1);
        myNums.add(3);
        myNums.add(2);

        System.out.println(myNums.toString());
        selectionSort(myNums);
        System.out.println(myNums.toString());

        String apple = "apple";
        String banana = "banana";
        String doritos = "doritos";
        System.out.println(apple.compareTo(banana));    //apple comes first alphabetically, ret neg val
        System.out.println(banana.compareTo(apple));    //banana comes after, ret pos val
        System.out.println(doritos.compareTo(apple));   // pos 3
        System.out.println(apple.compareTo(apple));     //zero
    }
    public static void selectionSort(ArrayList<Integer> list) {
        // outer for loop starts at 0 goes until second to last index
        for (int i = 0; i < list.size() - 1; i++) {
            // inner for loop compare each value AFTER index i to see if it is smaller
            // than the value at what it thought was the smallest

            // start out assuming that i is the index of where the smallest value is located
            // this index is updated if we find a smaller value later in array
            int min = i;

            for (int j = i + 1; j < list.size(); j++) {
                // check if the value at index j is smaller than the value at index min
                if (list.get(j) < list.get(min)) {
                    // update min and make min equal to index j, the new location of the smallest
                    min = j;
                }
            }

            // AFTER the inner loop has checked ALL values, the value at index min is SWAPPED with
            // value at position i and this smallest value is never moved again

            // a swap takes THREE lines of code
            Integer temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }
}