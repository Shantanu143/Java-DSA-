package conditionalsLoops;

//Subtract the Product and Sum of Digits of an Integer
public class SubtractTheProductAndSomeOfDigit {


    public static void main(String[] args) {


//        we have to Subtract some of products for some of digit

//        for example  213 = sum of products 2x1x3 ;
//        for example  213 = sum of digit 2+1+3 ;


        int number = 123;

        int sumOfDigit = 0;
        int sumOfProduct = 1;

        while (number != 0) {

            int rem = number % 10;

            sumOfDigit = sumOfDigit + rem;

            sumOfProduct = sumOfProduct * rem;

            number /= 10;

        }


        int subtract = sumOfProduct - sumOfDigit;

        System.out.println(subtract);

    }

}
