package functions;

public class SumOfTwoNumbers {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int a = 10, b = 20;

        System.out.println("sum  : " + sum(a, b));
        System.out.println("product  : " + product(a, b));

    }
}
