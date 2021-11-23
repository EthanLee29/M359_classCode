package U6_Arrays.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This file will show us how to access a text file and read in
 * info to use in our program
 *
 * The text file we want to read in needs to be saved in the root
 * folder for the IntelliJ project. This means it is OUTSIDE
 * of the src folder
 *
 * To create a text file, just right click on project root folder
 * and select New -> File and name it dataFile.txt
 * You will know the file is in the correct place if you can see the file
 * name when you minimize src folder
 */
public class BasicFilReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        //in the past we used the keyboard to get input
        Scanner input = new Scanner(System.in);

        //now, we want to tell Java to get input from another source
        //add "throws" clause to the main method header stating that
        // we are aware this could throw a FileNotFoundException
        // this is required unless we use a try/catch block
        Scanner fileIn = new Scanner(new File("dataFile.txt"));
        String name = fileIn.nextLine();    //Ethan
        int num = fileIn.nextInt();     //29
        fileIn.nextLine();  //Dummy read to clear end of line
        String phrase = fileIn.nextLine(); //Thankful for my family

        System.out.println(name + " " + num + " " + phrase);
    }
}
