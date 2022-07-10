package org.robotdreams.patterns.lesson2.homework2;

public class homework02 {

    public static void main(String[] args) {
        System.out.println("Starting Homework 02");

        new Task01SafeDelete(10, 20).execute(42);
        new Task02Extract(20).execute(11);
    }
}

/* Task 01: apply SafeDelete refactorings to not used code parts */
class Task01SafeDelete {

    private final int usedInput;
    private final int unusedInput;

    public Task01SafeDelete(int usedInput, int unusedInput){

        this.usedInput = usedInput;
        this.unusedInput = unusedInput;

        print("initialized", usedInput, 1);
    }
    public void execute(int i) { print("executed", i, 2);}

    private void print(String operation, int usedParam, int unusedParam) {
        System.out.println("SafeDeleteExample " + operation + " with " + usedInput);
    }

    // private void printTest(int usedParam, int unusedParam) {
    //     System.out.println("SafeDeleteExample received 0");
    // }
}

/* Task 02: apply extract refactorings as specified in code */
class Task02Extract {

    private final int first;

    public Task02Extract(int first){
        this.first = first;
    }
    public void execute(int second) {
        print("add",
                first,
                second,
                /* Extract to method named add */
                first + second
        );
        print("add",
                42, /* introduce constant named theAnswerToTheUltimateQuestion */
                second,
                /* Extract to method named add */
                42 + second
        );

        print("subtract",
                first,
                second,
                /* Extract to method named subtract */
                first - second
        );

        print("subtract",
                42, /* this should automatically be refactored by the "introduce constant" change */
                second,
                /* Extract to method named subtract */
                42 - second
        );

        print("multiply",
                first,
                second,
                /* Extract to method named multiply */
                first * second
        );
        print("divide",
                first,
                second,
                /* Extract to method named divide */
                first / second
        );
    }

    private void print(String name, int a, int b, int result) {
        System.out.println(String.join("",name,"(",Integer.toString(a),",",Integer.toString(b),")=",Integer.toString(result)));
    }
}
