package functions.flowOfProgram;

public class TableUsingFun {


    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + "x" + i + "=" + table);
        }
    }

    public static void main(String[] args) {
        table(5);
    }

}
