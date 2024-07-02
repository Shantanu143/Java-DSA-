package conditionalsLoops.besic;

//Input a number and print all the factors of that number
public class FactorsOfNumber {

    public static void main(String[] args) {


        int number = 435;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.print(i + " ");
            }

        }


    }
}
