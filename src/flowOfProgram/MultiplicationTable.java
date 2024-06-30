package flowOfProgram;
import java.util.Scanner;


//Take a number as input and print the multiplication table for it.

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        int count = 1;
        while (count <= numberTwo) {

            int sumOfTable = numberOne * count;
            System.out.println(numberOne + "x" + count + "=" + sumOfTable);
            count++;

        }

    }
}
