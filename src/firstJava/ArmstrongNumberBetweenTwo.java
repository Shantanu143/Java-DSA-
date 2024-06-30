package firstJava;


import java.util.Scanner;

public class ArmstrongNumberBetweenTwo {
    public static int armstrongNumber(int number) {
        int temp = number;
        int armstrongNumber = 0;
        while (number != 0) {
            int rem = number % 10;
            armstrongNumber = armstrongNumber + (rem * rem * rem);
            number = number / 10;
        }
        if (temp == armstrongNumber)
            return armstrongNumber;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two start and end numbers : (3digit only) ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            armstrongNumber(i);
        }


    }

}
