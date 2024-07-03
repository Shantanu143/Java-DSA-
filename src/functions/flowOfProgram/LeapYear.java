package functions.flowOfProgram;

public class LeapYear {


    public static boolean leapYear(int year) {
        return year % 4 == 0 || year % 100 != 0 && year % 400 == 0;
    }

    public static void main(String[] args) {
        int year = 1990;

        System.out.println(leapYear(year));

    }


}
