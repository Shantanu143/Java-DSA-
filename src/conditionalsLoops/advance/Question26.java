package conditionalsLoops.advance;

import java.util.Scanner;

public class Question26 {
    //    Write a program to print the sum of negative numbers,
    //    sum of positive even numbers and the sum of positive odd
    //    numbers from a list of numbers (N) entered by the user.
    //    The list terminates when the user enters a zero.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers  or 0 to end ");

        int negitiveNumberSum = 0;
        int positiveEvenNumberSum = 0;
        int positiveOddNumberSum = 0;

        while (true) {
            int number = sc.nextInt();
            if (number == 0) break;
            if (number > 0) {
                if (number % 2 == 0) {
                    positiveEvenNumberSum = positiveEvenNumberSum + number;
                } else {
                    positiveOddNumberSum = positiveOddNumberSum + number;
                }
            } else {
                negitiveNumberSum = negitiveNumberSum + number;
            }
        }
        System.out.println("Positive Even Number sum : " + positiveEvenNumberSum);
        System.out.println("Positive Odd Number sum : " + positiveOddNumberSum);
        System.out.println("Negitive Number sum : " + negitiveNumberSum);
    }
}
