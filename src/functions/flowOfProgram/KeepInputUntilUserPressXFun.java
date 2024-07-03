package functions.flowOfProgram;

import java.util.Scanner;

public class KeepInputUntilUserPressXFun {

    public static void sumTillXEnters() {

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
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumTillXEnters();
    }

}
