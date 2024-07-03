package functions;

import java.util.Scanner;

public class PrimeBetweenTwoNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        int c = 2;
        while (c * c <= num) {

            if (num % c == 0)
                return false;
            c++;
        }
        return c * c > num;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        for (int i = n1; i <= n2; i++) {
            if (isPrime(i))
                System.out.print(i + "  ");
        }


    }
}
