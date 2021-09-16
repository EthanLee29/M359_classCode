package U2_CreatingClasses.examples.quiz;

public class Quiz
{

    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String quizName;
    private int numMCQuestions;
    private boolean extraCredit;

    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit
    public Quiz() {
        quizName = "M359 Pop Quiz";
        numMCQuestions = 3;
        extraCredit = false;
    }

    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String nameOfQuiz, int numMultChoice, boolean hasExtraCredit) {
        quizName = nameOfQuiz;
        numMCQuestions = numMultChoice;
        extraCredit = hasExtraCredit;
    }

    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME
     /          Number MC's:    #
     /          Has EC:         true/false
     */
    public void printInfo(){
        System.out.println("\t" + quizName.toUpperCase());
        System.out.println("\t\tNumber MC'S:\t" + numMCQuestions);
        System.out.println("\t\tHas EC:\t" + extraCredit);
    }


    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything
    public void addMC(int additionalMC) {
        numMCQuestions += additionalMC;
    }

    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]
    public int calcExtraCredit() {
        return (int)(Math.random() * 5) + 2;
    }

    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz
    public int calcTotal(int MCPtVal) {
        return MCPtVal * numMCQuestions;
    }

    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods
    public String getQuizName() {
        return quizName;
    }

    public int getNumMCQuestions() {
        return numMCQuestions;
    }

    public boolean getExtraCredit() {
        return extraCredit;
    }

    public void setQuizName(String newName) {
        quizName = newName;
    }

    public void setNumMCQuestions(int newAmt) {
        numMCQuestions = newAmt;
    }

    public void setExtraCredit(boolean newECStatus) {
        extraCredit = newECStatus;
    }

    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"
}
