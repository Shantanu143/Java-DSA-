package conditionalsLoops.advance;

import java.util.Scanner;

public class SumOfNDigitNumbers {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers do you want to take input ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers");

        for (int i = 1; i <= n; i++) {

            int number = sc.nextInt();
            sum = sum + number;
        }

        System.out.println("Sum of Numbers : " + sum);
    }


}
