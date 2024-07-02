package conditionalsLoops.besic;

import java.util.Scanner;

//Area Of circle
public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius values : ");
        float r = sc.nextFloat();

        final float pie = 3.14f;

        float area = pie * (r * r);


        System.out.println(" Area of circle is : " + area);

    }
}
