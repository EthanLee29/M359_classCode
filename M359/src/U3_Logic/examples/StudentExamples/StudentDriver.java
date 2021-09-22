package U3_Logic.examples.StudentExamples;

public class StudentDriver {
    public static void main(String[] args) {
        Student st1 = new Student("Alice", "Smith", 113);
        Student st2 = new Student("Alice", "Smith", 212);
        Student st3 = new Student("Bob", "Smith", 784);
        Student st4 = new Student("Ziv", "Zidler", 999);

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));

        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));
        System.out.println(st3.compareTo(st4));
    }
}
