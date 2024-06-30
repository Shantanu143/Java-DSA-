package flowOfProgram;

import java.util.Scanner;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class SumOfNumberTillUserEntersX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers to sum and enter x to stop");

        int sum = 0;

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("x"))
                break;

            int number = Integer.parseInt(input);
            sum = sum + number;
        }

        System.out.println("Sum of Entered Numbers is : " + sum);


    }
}
