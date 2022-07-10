package org.robotdreams.patterns.lesson2.homework2;

public class homework02 {

    public static void main(String[] args) {
        System.out.println("Starting Homework 02");

        new SafeDeleteExample(15).execute(42);
    }
}

/* Task 01: apply SafeDelete refactorings to not used code parts */
class SafeDeleteExample {

    private final int input;

    public SafeDeleteExample(int input){

        this.input = input;
    }
    public void execute(int i) { print(i, 1);}
    private void unusedMethod(int i) { print(i, 2);}

    private void print(int usedParam, int unusedParam) {
        System.out.println("SafeDeleteExample received " + usedParam);
    }

    // private void printTest(int usedParam, int unusedParam) {
    //     System.out.println("SafeDeleteExample received 0");
    // }
}
