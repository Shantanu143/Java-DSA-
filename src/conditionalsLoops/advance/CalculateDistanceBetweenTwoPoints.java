package conditionalsLoops.advance;

//Calculate Distance Between Two Points

import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter point 1st point values (x,y)");


        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter point 2nd point values (x,y)");

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();


        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(distance);


    }


}
