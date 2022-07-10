package org.robotdreams.patterns.lesson2.homework2;

public class homework02 {

    public static void main(String[] args) {
        System.out.println("Starting Homework 02");

        new SafeDeleteExample().execute(42);
    }
}

/* Task 01: apply SafeDelete refactorings to not used code parts */
class SafeDeleteExample {
    public void execute(int i) { print(i, 1);}
    private void unusedMethod(int i) { print(i, 2);}

    private void print(int usedParam, int unusedParam) {
        System.out.println("SafeDeleteExample received " + usedParam);
    }
}
