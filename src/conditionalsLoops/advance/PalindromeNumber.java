package conditionalsLoops.advance;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 323, rev = 0;
        int origanalNumber = number;

        while (number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }

        if (origanalNumber == rev)
            System.out.println("Given number is palindrome ");
        else
            System.out.println("Number is not palindrome ");

    }


}
