package firstJava;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.

public class LargestNumberAmoungTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers  : ");

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        if (numberOne >= numberTwo) {

            System.out.println("Number " + numberOne + " is greater then " + numberTwo);
        } else {
            System.out.println("Number " + numberTwo + " is greater then " + numberOne);
        }
    }
}