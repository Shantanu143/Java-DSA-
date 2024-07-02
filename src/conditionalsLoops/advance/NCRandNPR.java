package conditionalsLoops.advance;

public class NCRandNPR {

    public static void main(String[] args) {
//        nCr (Combinations)


        int n = 5;
        int r = 3;
        int factN = 1;

        for (int i = 1; i <= n; i++) {
            factN = factN * i;
        }

        int factR = 1;
        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }

        int factN_R = 1;

        for (int i = 1; i <= (n - r); i++) {
            factN_R = factN_R * i;
        }

//        nCr
        double combination = (double) factN / (factN_R * factR);

        System.out.println("Combinations " + combination);


//        nPr

        double permutations = (double) factN / factN_R;

        System.out.println("Permutations : " + permutations);

//


    }


}
