package conditionalsLoops;

import org.w3c.dom.ls.LSOutput;

public class Fibonacci {
    public static void main(String[] args) {

        int number = 7;

        int a = 0, b = 1;

        int count = 1;

        while (count != number) {
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println(b);


    }
}
