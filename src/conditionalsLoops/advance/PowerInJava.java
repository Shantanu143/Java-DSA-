package conditionalsLoops.advance;

public class PowerInJava {

    public static void main(String[] args) {


        double base = 2;
        double exponent = 5;

        double ans = 1;
//        double ans = Math.pow(base, exponent);


        for (int i = 1; i <= exponent; i++) {
            ans *= base;
        }

        System.out.println(ans);


    }

}
