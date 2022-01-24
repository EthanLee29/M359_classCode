package U7_ArrayLists.examples;

public class yes {
    public static void main(String[] args) {
        int[] myNums = {1, 2, 3, 4};
        try {
            //System.out.println("The last value in the array is: " + myNums[4]);
            String str = "hi there";
            System.out.println(str.substring(3,12));
            System.out.println(str + " , no issues");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index, try again");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
