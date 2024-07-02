package conditionalsLoops.advance;

import java.util.Scanner;

//Calculate Discount Of Product
public class CalculateDiscountOfProduct {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Price  :");
        int price = sc.nextInt();

        System.out.println("Discount Rate  %:");
        float discountRate = sc.nextFloat();

        float discountedAmount = price * (discountRate / 100);


        float discountedPrice = price - discountedAmount;

        System.out.println("Product Price : " + discountedPrice);


    }
}
