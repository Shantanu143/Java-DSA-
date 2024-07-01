package conditionalsLoops;

import java.util.Scanner;

//Area Of Parallelogram
public class AreaOfParallelogram {

    public static void main(String[] args) {
        // Area Of Parallelogram  = base x height

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tha values of base and height ");

        float base = sc.nextFloat();
        float height = sc.nextFloat();

        float areaOfParallelogram = base * height;

        System.out.println("Area of parallelogram = " + areaOfParallelogram);


    }
}
