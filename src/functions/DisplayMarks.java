package functions;

public class DisplayMarks {

    public static String grade(int marks) {


        if (marks <= 100 && marks >= 91)
            return "AA";
        else if (marks >= 81 && marks <= 90)
            return "AB";
        else if (marks >= 71 && marks <= 80)
            return "BB";
        else if (marks >= 61 && marks <= 70)
            return "BC";
        else if (marks >= 51 && marks <= 60)
            return "CD";
        else if (marks >= 41 && marks <= 50)
            return "DD";
        else if (marks <= 40)
            return "fail";
        else
            return "Enter Valid marks";

    }

    public static void main(String[] args) {


        int marks = 39;

        System.out.println(grade(marks));


    }

}
