package conditionalsLoops;

import java.util.Scanner;

public class LargestNumberTillUserEnters0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers  : ");

        int max = Integer.MIN_VALUE;

        while (true) {

            int n = sc.nextInt();

            if (n == 0)
                break;

            if (n > max)
                max = n;

        }

        System.out.println(max);

    }
}
