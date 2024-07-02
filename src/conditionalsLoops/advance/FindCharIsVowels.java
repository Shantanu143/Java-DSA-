package conditionalsLoops.advance;

import java.util.Scanner;

public class FindCharIsVowels {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Charector : ");

        char ch = sc.next().trim().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel : ");
        } else
            System.out.println("Consonant");

    }
}
