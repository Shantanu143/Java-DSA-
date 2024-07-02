package conditionalsLoops.advance;

public class CompoundInterest {

    public static void main(String[] args) {


        int principleAmt = 10000;
        float rateOfIntrest = 0.05f;
        float compoundedPerYear = 1;
        float time = 3;

        double compoundInterest = principleAmt * Math.pow((1 + (rateOfIntrest / compoundedPerYear)), (compoundedPerYear * time));


        System.out.println(compoundInterest);


    }

}
