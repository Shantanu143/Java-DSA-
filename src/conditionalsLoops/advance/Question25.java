package conditionalsLoops.advance;

import java.util.Scanner;

public class Question25 {
//    Kunal is allowed to go out with his friends only on the even days of a given month.
//    Write a program to count the number
//    of days he can go out in the month of August.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int days = 0, count = 0;
        System.out.println("Enter the month ");

        String month = sc.next();

        switch (month) {

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                days = 31;
                for (int i = 1; i <= days; i++) {
                    if (i % 2 == 0)
                        count++;
                }

                System.out.println("Number of days he can go out is : " + count);
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                days = 30;
                count = 0;
                for (int i = 1; i <= days; i++) {
                    if (i % 2 == 0)
                        count++;
                }

                System.out.println("Number of days he can go out is : " + count);
                break;

            case "February":
                days = 28;
                count = 0;
                for (int i = 1; i <= days; i++) {
                    if (i % 2 == 0)
                        count++;
                }

                System.out.println("Number of days he can go out is : " + count);
                break;
            default:
                System.out.println("Enter a valid month");


        }


    }


}
