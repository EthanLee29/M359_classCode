package U6_Arrays.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTesterFinal {
    public static void main(String[] args) throws FileNotFoundException {
        // create a Scanner for studentScheduleData.txt file
        Scanner data = new Scanner(new File("studentScheduleData.txt"));
        // read in first line of data to determine how big to
        // make the Student array and create an array of Students
        int size = data.nextInt();
        data.nextLine();
        Student[] myStudents = new Student[size];
        int currentIndex = 0;

        // outer loop will control the Student object being put
        // into the Student array - use while loop and continue
        // while their is still more data
        while (data.hasNextLine() && currentIndex < size) {
            String name = data.nextLine();
            Student student = new Student(name);

            // use a for loop to read in all data for each course one at a time
            // create a new Course object, add it to the array, and continue
            // until all data is read

            for (int i = 0; i < 8; i++) {
                String t = data.nextLine();
                String c = data.nextLine();
                String g = data.nextLine();
                int p = data.nextInt();

                // checking to see if more data exists
                if (data.hasNextLine())
                    data.nextLine();     // dummy read

                // create Course object, add to array
                Course course = new Course(t, c, g, p);
                student.setOneCourse(p, course);
            }
            // add Student object to myStudents array
            myStudents[currentIndex] = student;
            currentIndex++;
        }

        for (Student s: myStudents)
            if (s != null)
                System.out.println(s);
    }
}
