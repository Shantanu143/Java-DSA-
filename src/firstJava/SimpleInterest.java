package firstJava;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        simple Interest  =  p * t * r  / 100  ;

        System.out.println("Enter your principal amount  : ");
        int principalAmount = sc.nextInt();

        System.out.println("Enter your Time  : ");
        float time = sc.nextFloat();

        System.out.println("Enter your Rate of Interest  : ");
        float rateOfInterest = sc.nextFloat();


        double simpleInterest = (principalAmount * time * rateOfInterest) / 100;

        System.out.println("Simple interest  =  " + simpleInterest);


    }

}
