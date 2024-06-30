package firstJava;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check wether number is even or odd");

        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("Given Number is Even : " + number);
        else
            System.out.println("Given Number is Odd : " + number);

    }


}
