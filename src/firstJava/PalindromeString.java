package firstJava;

//To find out whether the given String is Palindrome or not.

public class PalindromeString {

    public static void main(String[] args) {

        String str = "dad";
        String rev = "";

        char c[] = str.toCharArray();

        for (int i = c.length - 1; i >= 0; i--) {
            rev = rev + c[i];
        }

        if (str.equals(rev))
            System.out.println("Given string is Palindrome");
        else
            System.out.println("Given string is Not Palindrome");

    }
}
