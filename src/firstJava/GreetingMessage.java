package firstJava;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class GreetingMessage {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your good name dear : ");

        String name = sc.next();

        System.out.println("Hello " + name + " nice to meet you :) ");

    }
}
