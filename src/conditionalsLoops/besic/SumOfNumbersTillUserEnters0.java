package conditionalsLoops.besic;


import java.util.Scanner;

public class SumOfNumbersTillUserEnters0 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("enter number for sum and 0 to end the program ");

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            sum = sum + n;
        }
        System.out.println(sum);
    }

}
