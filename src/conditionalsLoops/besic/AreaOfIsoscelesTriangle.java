package conditionalsLoops.besic;

import java.util.Scanner;

//Area Of Isosceles Triangle
public class AreaOfIsoscelesTriangle {

    public static void main(String[] args) {

//        b is the length of the base,
//        h is the height (the perpendicular distance from the base to the apex).

//        formula a = (1 / 2) * b * h

//a = length of equal sides
//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of base (B) and  two equal sides (A)");

        float b = sc.nextFloat();
        float a = sc.nextFloat();

        double h = Math.sqrt((a * a) - ((b / 2) * (b / 2)));


        double areaOfIsoscelesTriangles = 0;

        // insted 1/2 we used the 0.5

        areaOfIsoscelesTriangles = 0.5 * (b * h);

        System.out.println("Area Of Isosceles Triangles : " + areaOfIsoscelesTriangles);

    }
}
