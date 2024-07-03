package functions.flowOfProgram;

public class HCMandLCMUsingFun {

    public static int calculateHCM(int n1, int n2) {
        while (n2 != 0) {
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;

    }

    public static int calculateLCM(int n1, int n2, int hcm) {
        return n1 * n2 / hcm;
    }

    public static void main(String[] args) {

        int n1 = 16;
        int n2 = 72;
        int hcm = calculateHCM(n1, n2);
        int lcm = calculateLCM(n1, n2, hcm);
        System.out.println("LCM = " + lcm);
        System.out.println("HCM = " + hcm);

    }


}
