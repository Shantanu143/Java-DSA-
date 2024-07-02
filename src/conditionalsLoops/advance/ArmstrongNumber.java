package conditionalsLoops.advance;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153, armNumber = 0;

        int orognalNumber = number;


        while (number != 0) {
            int rem = number % 10;
            armNumber = (int) (armNumber + (Math.pow(rem, 3)));
            number /= 10;
        }

        if (orognalNumber == armNumber)
            System.out.println("this is armstrong number ");
        else
            System.out.println("this is not armstrong ");


    }

}
