package conditionalsLoops.besic;

public class Perimeters {

    public static void main(String[] args) {


//        Perimeter Of Equilateral Triangle

        int s = 10;

        double perimeterOfEquilateralTriangle = 3 * s;
        System.out.println(perimeterOfEquilateralTriangle);


//        Perimeter of a Parallelogram

//        a is the length of one pair of opposite sides,
//        b is the length of the other pair of opposite sides.

        int a = 10;
        int b = 20;

        double p = 2 * (a + b);
        System.out.println("Perimeter of a Parallelogram : " + p);

//        Perimeter of a Rectangle


        int length = 10;
        int width = 20;


        int pRectangle = 2 * (length * width);

        System.out.println("Perimeter of a Rectangle : " + pRectangle);


//        Perimeter of a Square


        int side = 10;

        int pSquare = 4 * side;

        System.out.println("Perimeter of a Square : " + pSquare);


//        Perimeter of a Rhombus

        int sideRhombus = 10;

        int pRhombus = 4 * side;

        System.out.println("Perimeter of a Rhombus : " + pRhombus);


    }


}
