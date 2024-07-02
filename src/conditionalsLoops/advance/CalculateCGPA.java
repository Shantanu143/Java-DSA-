package conditionalsLoops.advance;

import java.util.Scanner;

public class CalculateCGPA {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Course 1 Grade (10) , and Grade Points ");
        int c1Grade = sc.nextInt();
        float c1GradePoint = sc.nextFloat();

        System.out.println("Enter Course 2 Grade (10) and Grade Points");
        int c2Grade = sc.nextInt();
        float c2GradePoint = sc.nextFloat();

        System.out.println("Enter Course 3 Grade (10) and Grade Points");
        int c3Grade = sc.nextInt();
        float c3GradePoint = sc.nextFloat();

        System.out.println("Enter Course 4 Grade (10) and Grade Points");
        int c4Grade = sc.nextInt();
        float c4GradePoint = sc.nextFloat();

        System.out.println("Enter Course 5 Grade (10) and Grade Points");
        int c5Grade = sc.nextInt();
        float c5GradePoint = sc.nextFloat();


//        calculate grade point for each cource


        c1GradePoint = c1Grade * c1GradePoint;
        c2GradePoint = c2Grade * c2GradePoint;
        c3GradePoint = c3Grade * c3GradePoint;
        c4GradePoint = c4Grade * c4GradePoint;
        c5GradePoint = c5Grade * c5GradePoint;


//        same of grade points

        double sumOfGradePoints = c1GradePoint + c2GradePoint + c3GradePoint + c4GradePoint + c5GradePoint;

//        same of creadits

        double sumOfCreadits = c1Grade + c2Grade + c3Grade + c4Grade + c5Grade;


//        cgpa  = sumOfGradePoints / sumOfCreadits


        double cgpa = sumOfGradePoints / sumOfCreadits;

        System.out.println("CGPA  =  " + cgpa);

    }
}
