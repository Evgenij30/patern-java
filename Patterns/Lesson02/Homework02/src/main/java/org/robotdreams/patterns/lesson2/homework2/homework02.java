package org.robotdreams.patterns.lesson2.homework2;

public class homework02 {

    public static void main(String[] args) {
        System.out.println("Starting Homework 02");

        new Task01SafeDelete().execute(42);
        new TaskNewName(20).call(11);
        new Task03Extract(20).execute(11);
        new Task04Inline(20).execute(11);
    }
}

/* TODO: Task 01: apply SafeDelete refactorings to not used code parts */
class Task01SafeDelete {

    public void execute(int i) { print("executed", i);}

    private void print(String operation, int usedParam) {
        System.out.println("SafeDeleteExample " + operation + " with " + usedParam);
    }
}

/* TODO: Task 02: apply Rename refactorings as specified in comments */
class TaskNewName { // rename class name also considering the name in string

    private final int usedInput;

    public TaskNewName(int input){
            this.usedInput = input; // rename field to match parameter name

            System.out.println("TaskNewName initialized with " + input);
        }

        // rename method from "call" to "execute"
        public void call(int i) { // rename parameter "i" to "param"
            System.out.println("TaskNewName executed with " + i);
        }
}

/* TODO: Task 03: apply extract refactorings as specified in comments */
class Task03Extract {

    public static final int theAnswerToTheUltimateQuestion = 42;
    private final int first;

    public Task03Extract(int first){
        this.first = first;
    }

    public int add(int numberOne, int numberTwo)
    {
        return numberOne + numberTwo;
    }

    public int subtract(int numberOne, int numberTwo)
    {
        return numberOne - numberTwo;
    }

    public int multiply(int numberOne, int numberTwo)
    {
        return numberOne * numberTwo;
    }

    public int divide(int numberOne, int numberTwo)
    {
        return numberOne / numberTwo;
    }

    public void execute(int second) {
        print("add",
                first,
                second,
                add(first , second)
        );
        print("add",
                theAnswerToTheUltimateQuestion,
                second,
                add(theAnswerToTheUltimateQuestion , second)
        );

        print("subtract",
                first,
                second,
                subtract( first, second)
        );

        print("subtract",
                theAnswerToTheUltimateQuestion,
                second,
                subtract( theAnswerToTheUltimateQuestion, second)
        );

        print("multiply",
                first,
                second,
                multiply(first , second)
        );
        print("divide",
                first,
                second,
                divide(first , second)
        );
    }

    private void print(String name, int a, int b, int result) {
        System.out.println(String.join("",name,"(",Integer.toString(a),",",Integer.toString(b),")=",Integer.toString(result)));
    }
}

/* TODO: Task 04: apply inline refactorings as specified in comments */
class Task04Inline {

    public Task04Inline(int first){

        System.out.println("Task04Inline " + "initialized" + " with " + first);
    }
    public void execute(int second) {
        System.out.println("Task04Inline " + "executed" + " with " + second);
    }
}
