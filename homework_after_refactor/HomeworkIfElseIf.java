package homework_after_refactor;

import java.util.Arrays;

public class HomeworkIfElseIf {

    public static void main(String[] args) {

        // Here we accept the variables from input of the application
        // using the args
        if(args.length < 3)
        {
            System.out.println("There should be 3 arguments to call this method. Examples:");
            System.out.println("+ 3 4");
            System.out.println("/ 3 4");
            System.out.println("* 3 4");
            System.out.println("- 3 4");
            return;
        }

        // The four variable and their initialization
        char chosenOperation = args[0].charAt(0); // '+';
        // Parsing the input value can throw exception when the given argument
        // is not a number but for the sake of simplicity we ignore that use-case
        int a = Integer.parseInt(args[1]); // 3;
        int b = Integer.parseInt(args[2]); // 4;
        double sum;

        char[] availableOperations = {'+', '-', '*', '/'};

        if(chosenOperation == '+')        {
            sum = a + b;
        } else if (chosenOperation == '-') {
            sum = a - b;
        } else if (chosenOperation == '*') {
            sum = a * b;
        } else if (chosenOperation == '/' && b != 0) {
            sum = (double) a / b;
        } else if (chosenOperation == '/' && b == 0) {
            System.out.println("Divide by zero is not possible.");
            return;
        } else {
            System.out.println("Operation not supported. Supported operations: " + Arrays.toString(availableOperations));
            return;
        }

        System.out.println(a + " " + chosenOperation + " " + b + " = " + sum);
    }



}