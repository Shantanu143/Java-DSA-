package functions;

public class OddEven {
    public static boolean oddOrEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        int n = 11;
        System.out.println(oddOrEven(n));

    }
}
