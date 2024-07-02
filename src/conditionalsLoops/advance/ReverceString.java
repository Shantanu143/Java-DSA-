package conditionalsLoops.advance;

public class ReverceString {

    public static void main(String[] args) {


        String str = "shantanu";
        String newStr = "";

        char ch[] = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }

        System.out.println(newStr);


    }


}
