package U3_Logic.examples.StudentExamples;

public class Student {
    private String fName;
    private String lName;
    private int idNum;

    public Student(String firstN, String lastN, int numID) {
        fName = firstN;
        lName = lastN;
        idNum = numID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public boolean equals(Student other) {
        return (this.lName.equals(other.lName) && this.fName.equals(other.fName));
    }

    public int compareTo(Student other) {
        if(!this.lName.equals(other.lName)) {
            return this.lName.compareTo(other.lName);
        }else {
            return this.fName.compareTo(other.fName);
        }
    }
}
