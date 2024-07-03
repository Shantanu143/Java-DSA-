package functions;

public class MaxAndMinNumber {

    public static int maxNumber(int a, int b, int c) {
        if (a < b)
            if (b < c)
                return c;
            else
                return b;
        else if (a < c)
            return c;
        else
            return a;
    }

    public static int minNumber(int a, int b, int c) {
        if (a > b)
            if (b > c)
                return c;
            else
                return b;
        else if (a > c)
            return c;
        else
            return a;
    }

    public static void main(String[] args) {
        int n1 = 1000, n2 = 2000000, n3 = 30000;
        System.out.println(maxNumber(n1, n2, n3));
        System.out.println(minNumber(n1, n2, n3));

    }
}
