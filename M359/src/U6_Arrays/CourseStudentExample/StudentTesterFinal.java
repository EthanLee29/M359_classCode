package U6_Arrays.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTesterFinal {
    public static void main(String[] args) throws FileNotFoundException {
        //create a Scanner for studentScheduleData.txt file
        Scanner studentScheduleDataFile = new Scanner(new File("studentScheduleData.txt"));


        //read in first line of data to determine how big to
        //make the Student array and create an array of Students
        int classSize = studentScheduleDataFile.nextInt();
        Student[] list = new Student[classSize];

        //outer loop will control the Student object being put
        //into the Student array - use while loop and continue
        //while there is still more data
        while(studentScheduleDataFile.hasNextLine()) {
            Student s = new Student()
            //inner loop will process data for each Student (what we
            //already did)

            for (int i = 0; i < 8; i++) {
                String t = studentScheduleDataFile.nextLine();
                String c = studentScheduleDataFile.nextLine();
                String g = studentScheduleDataFile.nextLine();
                int p = studentScheduleDataFile.nextInt();

                //checking to see if more data exists
                if (studentScheduleDataFile.hasNextLine()) {
                    studentScheduleDataFile.nextLine();     //dummy read
                }

                //create a Course object, add to array
                Course course = new Course(t, c, g, p);
                student.setOneCourse(p, course);
            }
        }
    }
}
