package firstJava;


//  Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


import java.util.Scanner;

public class CalculationBasedOnCondition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers  : ");

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        System.out.println("Enter the operator  : ");
        String operator = sc.next();


        if (operator.equalsIgnoreCase("+")) {

            System.out.println("Sum of two numbers = " + (numberOne + numberTwo));

        } else if (operator.equalsIgnoreCase("-")) {

            System.out.println("Sub of two numbers = " + (numberOne - numberTwo));

        } else if (operator.equalsIgnoreCase("*")) {

            System.out.println("Multi of two numbers = " + (numberOne * numberTwo));

        } else if (operator.equalsIgnoreCase("/")) {

            System.out.println("Div of two numbers = " + (numberOne / numberTwo));

        } else {

            System.out.println("Enter the valid operator ");

        }


    }
}
