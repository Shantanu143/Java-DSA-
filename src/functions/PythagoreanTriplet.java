package functions;

public class PythagoreanTriplet {


    public static boolean isPythagorean(int nums[]) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    int a = nums[i] * nums[i];
                    int b = nums[j] * nums[j];
                    int c = nums[k] * nums[k];

                    if (a == b + c)
                        return true;
                }

            }
        }
        return false;


    }


    public static void main(String[] args) {
        int arr[] = {10, 4, 6, 12, 5};
        System.out.println(isPythagorean(arr));

    }


}