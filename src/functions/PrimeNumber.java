package functions;

public class PrimeNumber {

    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        int c = 2;

        while (c * c <= number) {
            if (number % c == 0)
                return false;
            c++;

        }

        return c * c > number;

    }

    public static void main(String[] args) {

        System.out.println(isPrime(10));

    }

}


