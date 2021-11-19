package U6_Arrays.CourseStudentExample;

/**
 * This class will represent one course in a student's complete day
 */

public class Course {
    private String teacherName, subject, currentGrade;
    int period;

    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    //This constructor would be used for a period like lunch or study hall
    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        teacherName = "None";
        currentGrade = "none";
    }

    public String toString() {
        String str = "";
        str = period + " " + teacherName + " " + subject + " " + currentGrade;
        return str;
    }

    //All basic get/set methods
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
