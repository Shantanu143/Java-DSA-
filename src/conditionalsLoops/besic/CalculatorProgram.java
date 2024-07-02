package conditionalsLoops.besic;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;


        while (true) {


            System.out.println("Enter two numbers or x to end program : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Enter the Opretor : ");

            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                if (op == '+')
                    ans = num1 + num2;
                if (op == '-')
                    ans = num1 - num2;
                if (op == '*')
                    ans = num1 * num2;
                if (op == '/')
                    if (num1 != 0 || num2 != 0)
                        ans = num1 / num2;
                if (op == '%')
                    ans = num1 % num2;

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid opretor ");
            }
            System.out.println(ans);

        }


    }
}
