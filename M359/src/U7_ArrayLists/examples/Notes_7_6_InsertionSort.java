package U7_ArrayLists.examples;

import java.util.ArrayList;

public class Notes_7_6_InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(4);
        myNums.add(2);
        myNums.add(7);
        myNums.add(1);
        myNums.add(3);
        myNums.add(2);

        System.out.println(myNums);
        System.out.println();
        insertionSort(myNums);
        System.out.println(myNums);
    }

    public static void insertionSort (ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            Integer valueToInsert = list.get(i);    //temp storage
            int pos = i;    // current location of value we are trying to place into the sorted sublist

            // while there is still a value to check before me and the
            // value before me is greater than the value to insert
            // the order of these conditions matters because is prevents an
            // out of bounds error when doing .get(position - 1)
            while (pos > 0 && list.get(pos - 1) > valueToInsert) {
                // the larger value needs to slide right
                list.set(pos, list.get(pos - 1));
                // move left and continue comparison of next value
                pos--;
            }

            // we have found the location where valueToInsert needs to go
            // it is either at the correct spot or at index 0
            list.set(pos, valueToInsert);
        }
    }
}
