package functions;

public class AreaOfCircle {

    public static double areaOfCircle(float radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double circumferenceOfCircle(float radius) {
        return 2 * (Math.PI * radius);
    }


    public static void main(String[] args) {

        float radius = 3f;
        System.out.println("Area of circle : " + areaOfCircle(radius));
        System.out.println("Area of Circumference : " + circumferenceOfCircle(radius));

    }

}
