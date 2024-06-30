package flowOfProgram;

import java.util.Scanner;


//Take two numbers and print the sum of both.


public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for the sum of two numbers : ");

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        int sum = numberOne + numberTwo;

        System.out.println("Sum of two numbers is : " + sum);


    }

}
