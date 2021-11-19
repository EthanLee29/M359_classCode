package U6_Arrays.CourseStudentExample;

/**
 * This file will show how the Course and Student class interact together
 * We will also learn how to read a text file of data and use the data to
 * fill in objects and add them to the array
 */
public class StudentTester {
    public static void main(String[] args) {

        //Creating 8 Course objects to represent an 8 period day
        Course per1 = new Course ("Vlaming", "Strength and Conditioning", "A+", 1);
        Course per2 = new Course ("Denna", "Java - the best", "C-", 2);
        Course per3 = new Course ("Munao", "AP Lit", "A", 3);
        Course per4 = new Course ("Lunch", 4);
        Course per5 = new Course ("Snyder", "French 3", "A", 5);
        Course per6 = new Course ("Mantra", "BC Calc", "D+", 6);
        Course per7 = new Course ("Graba", "AP Envirn", "A", 7);
        Course per8 = new Course ("Frieri", "APUSH", "B", 8);

        //We can create a Course[] using an initializer list with these 8 variables
        Course[] schedule = {per1, per2, per3, per4, per5, per6, per7, per8};
        Student lilDenna = new Student("Lil Denna", schedule);

        //Print all Course objects in Course array using Course toString
        for (int i = 0; i < schedule.length; i++) {
            System.out.println(schedule[i]);
        }
    }
}
