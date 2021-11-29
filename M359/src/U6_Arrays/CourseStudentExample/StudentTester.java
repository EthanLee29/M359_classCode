package U6_Arrays.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This file will show how the Course and Student class interact together
 * We will also learn how to read a text file of data and use the data to
 * fill in objects and add them to the array
 */
public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {

        // Here we are reading in data for ONE Course object
        Scanner oneCourseFile = new Scanner(new File("oneCourse.txt"));
        String teacher = oneCourseFile.nextLine();
        String courseName = oneCourseFile.nextLine();
        String grade = oneCourseFile.nextLine();
        int period = oneCourseFile.nextInt();

        Course myCourse = new Course (teacher, courseName, grade, period);
        System.out.println(myCourse);

        //Here we are reading in data for an entire Student object
        Scanner oneScheduleFile = new Scanner (new File("OneSchedule.txt"));
        String name = oneScheduleFile.nextLine();
        Student student = new Student(name);

        //use a for loop to read in all the data for each course one at a time
        //create a new Course object, add it to the array, and continue
        //until all data is read

        for (int i = 0; i < 8; i++) {
            String t = oneScheduleFile.nextLine();
            String c = oneScheduleFile.nextLine();
            String g = oneScheduleFile.nextLine();
            int p = oneScheduleFile.nextInt();
        }

//        Student[] dennaAllStars = new Student[5];
//
//        //Creating 8 Course objects to represent an 8 period day
//        Course per1 = new Course ("Vlaming", "Strength and Conditioning", "A+", 1);
//        Course per2 = new Course ("Denna", "Java - the best", "C-", 2);
//        Course per3 = new Course ("Munao", "AP Lit", "A", 3);
//        Course per4 = new Course ("Lunch", 4);
//        Course per5 = new Course ("Snyder", "French 3", "A", 5);
//        Course per6 = new Course ("Mantra", "BC Calc", "D+", 6);
//        Course per7 = new Course ("Graba", "AP Envirn", "A", 7);
//        Course per8 = new Course ("Frieri", "APUSH", "B", 8);
//
//        //We can create a Course[] using an initializer list with these 8 variables
//        Course[] schedule = {per1, per2, per3, per4, per5, per6, per7, per8};
//        Student lilDenna = new Student("Lil Denna", schedule);
//        Student khushi = new Student("Khushi", schedule);
//
//        System.out.println(lilDenna);
//
//        dennaAllStars[0] = lilDenna;
//        dennaAllStars[1] = khushi;
//        dennaAllStars[2] = new Student("Nate", schedule);
//        dennaAllStars[3] = new Student("Lil Guatham", schedule);
//
//        for (Student s: dennaAllStars) {
//            if (s != null)
//                System.out.println(s);
//        }
//
//        //Print all Course objects in Course array using Course toString
////        for (int i = 0; i < schedule.length; i++) {
////            System.out.println(schedule[i]);
////        }
//
//
    }
}
