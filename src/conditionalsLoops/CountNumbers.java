package conditionalsLoops;

import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hole number ");
        int number = sc.nextInt();

        System.out.println("Enter digit you want to find");
        int findNumber = sc.nextInt();

        int originalNumber = number;

        int count = 0;
        while (number != 0) {
            int rem = number % 10;

            if (rem == findNumber)
                count++;

            number /= 10;
        }

        if (count == 0)
            System.out.println("Number not found ");
        else
            System.out.println("In number " + originalNumber + " number " + findNumber + " occurs in " + count + " many times");
    }
}
