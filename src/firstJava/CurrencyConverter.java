package firstJava;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class CurrencyConverter {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount in rupee : ");

//      today 1 dollar   83.36

        double rs = sc.nextDouble();

        double dollars = rs / 83.36;

        System.out.println("Money in dollars : " + dollars);


    }

}
