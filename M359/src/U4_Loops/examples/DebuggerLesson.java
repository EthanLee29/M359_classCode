package U4_Loops.examples;

public class DebuggerLesson {
    public static void main(String[] args) {
        /*
        To start debugger you need to add a breakpoint to
        tell IntelliJ where to pause in the execution
        of the code.

        To do this, click in the grey side next to the line
        number of the line where you want to pause.

        You will see a red circle and the line will be
        highlighted in red.

        To run the program in debug mode, click on the bug next
        to the green play button up top.
         */
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            printHi();
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        everyOtherLetterPyramid("FremdVikings");
    }

    public static void printHi() {
        System.out.println("Hi class");
    }

    public static void everyOtherLetterPyramid(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j += i) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }

}
