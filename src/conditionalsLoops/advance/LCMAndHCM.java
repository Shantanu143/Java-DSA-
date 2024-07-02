package conditionalsLoops.advance;

public class LCMAndHCM {

    public static int calculateLCM(int number1, int number2) {
        while (number2 != 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }

    public static int calculateHCM(int number1, int number2, int lcm) {
        return (number1 * number2) / lcm;
    }


    public static void main(String[] args) {


        int number1 = 98, number2 = 56;
        int lcm = calculateLCM(number1, number2);
        System.out.println(calculateLCM(number1, number2));
        System.out.println(calculateHCM(number1, number2, lcm));

    }

}
