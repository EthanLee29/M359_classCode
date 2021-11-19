package U6_Arrays.CourseStudentExample;

public class Student {
    private String name;
    private Course[] myClasses; //create my reference variable

    /**
     * Create a Student object that doesn't have a schedule of classes yet
     * The schedule array of classes is ready to be filled, but currently all
     * entries are null
     * @param name the name of Student
     */
    public Student(String name) {
        this.name = name;
        myClasses = new Course[8]; // currently this schedule is filled with
                                   // null Course reference variables
    }

    /**
     * Create a Student object with a schedule of classes already created
     * @param name name of student
     * @param myClasses fully filled in array of Classes
     */
    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}
