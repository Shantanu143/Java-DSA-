package firstJava;


import java.util.Scanner;

public class ArmstrongNumberBetweenTwo {
    public static boolean armstrongNumber(int number) {
        int originalNumber = number;
        int armstrongNumber = 0;
        while (number != 0) {
            int rem = number % 10;
            armstrongNumber = armstrongNumber + (rem * rem * rem);
            number = number / 10;
        }
        return originalNumber == armstrongNumber;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two start and end numbers : (3digit only) ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (armstrongNumber(i))
                System.out.println(i);

        }


    }

}
