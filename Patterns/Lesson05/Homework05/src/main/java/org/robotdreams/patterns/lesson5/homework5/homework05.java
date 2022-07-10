package org.robotdreams.patterns.lesson5.homework5;

public class homework05 {

    public static void main(String[] args) throws Exception {
        if (args.length != 1)
            throw new Exception("Number of arguments provided " + args.length + "doesn't match expected: 1");

        // TODO: either use command line argument or initialize all types supported by your factory and provide to the test below
        String luckType = args[0];
        ExecuteSpecificLuckGenerator(luckType);
    }

    private static void ExecuteSpecificLuckGenerator(String luckType) {
        System.out.println("Testing luck generator of type '" + luckType + "'");

        var luckGenerator = new LuckFactory().GetLuckGenerator(luckType);

        for (int iteration = 0; iteration < 5; iteration++) {
            System.out.println("Test #" + iteration + ", LuckGenerator '" + luckGenerator.GetType() + "': " + luckGenerator.GenerateNext());
        }
    }
}

