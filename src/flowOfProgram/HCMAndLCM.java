package flowOfProgram;

//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HCMAndLCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();


//        according to the Euclidean Algorithm calculate the lcm is  Greatest Common Divisor   (gcd) =  n2%n1 ;
//        then multiple both the numbers n1*n2 = sum  ;
//        then divide it using gcd like  lcm =  sum / gcd ;
//

        int GCD = numberTwo % numberOne;

        int multiplication = numberOne * numberTwo;

        int LCM = multiplication / GCD;

        System.out.println("Lest common multiple :  " + LCM);


//(HCF) Highest Common Factor


        while (numberTwo != 0) {

            int rem = numberOne % numberTwo;

            numberOne = numberTwo;
            numberTwo = rem;


        }

        System.out.println("Highest Common Factor  = " + numberOne);

    }

}
