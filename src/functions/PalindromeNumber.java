package functions;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {


        int orignalNumber = number;
        int rev = 0;
        while (number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        return orignalNumber == rev;


    }


    public static void main(String[] args) {
        int number = 222;
        System.out.println(isPalindrome(number));
    }


}
