package conditionalsLoops.advance;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class AvgOfNNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N");

        int sum = 0;
        int n = sc.nextInt();

        System.out.println("Enter the Numbers ");
        for (int i = 1; i <= n; i++) {

            int numbers = sc.nextInt();
            sum = sum + numbers;

        }

        float avg = ((float) sum / n);

        System.out.println("Avg of N numbers is " + avg);

    }

}
