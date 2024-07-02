package conditionalsLoops.besic;

import java.util.Scanner;

//Area Of Rectangle Program
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of length and width to calculate the area of Rectangle : ");
        float length = sc.nextFloat();
        float width = sc.nextFloat();

        float areaOfRectangle = length * width;


        System.out.println("Area of Rectangle : " + areaOfRectangle);


    }
}
