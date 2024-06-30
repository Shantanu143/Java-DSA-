package firstJava;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N  : ");

        int n = sc.nextInt();

        int n1 = 1, n2 = 0;

        for (int i = 1; i < n; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            int temp = n3;
            n2 = n1;
            n1 = temp;

        }

    }

}
