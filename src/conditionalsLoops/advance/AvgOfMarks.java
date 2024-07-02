package conditionalsLoops.advance;

import java.util.Scanner;

public class AvgOfMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 6 subjects");

        int sum = 0;
        for (int i = 0; i < 6; i++) {

            int marks = sc.nextInt();
            sum = sum + marks;

        }

        float avgMarks = (float) sum / 6;

        System.out.println(avgMarks);


    }

}
