package U6_Arrays.TriviaLab;

public class Question {
    // variables for question, choices a, b, c, and d, as well as the actual answer
    private String q, a, b, c, d, correctAns;
    int value;

    public Question(String q, String a, String b, String c, String d, String correctAns, int value) {
        this.q = q;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.correctAns = correctAns;
        this.value = value;
    }

    public Question() {
        q = "";
        a = "";
        b = "";
        c = "";
        d = "";
        correctAns = "";
        value = 0;
    }

    public String toString() {
        String str = "";
        str += q + "\n";
        str += "\t" + a + "\n\t" + b + "\n\t" + c + "\n\t" + d + "\n\t";

        return str;
    }

    /**
     * This method is used to check if two questions are the same. It's only necessary to
     * check for the q variable because no two questions ask the same thing
     * @param other other question
     * @return true if the questions are equal, false otherwise
     */
    public boolean equals(Question other) {
        return (this.getQ().equals(other.getQ()));
    }

    public String getQ() {
        return q;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public int getValue() {
        return value;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
