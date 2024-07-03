package functions;

public class Vote {

    public static boolean vote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {

        int age = 17;

        System.out.println(vote(age));

    }

}
