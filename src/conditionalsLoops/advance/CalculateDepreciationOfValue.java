package conditionalsLoops.advance;

//Calculate Depreciation of Value
public class CalculateDepreciationOfValue {

    public static void main(String[] args) {

        int initialCost = 10000;
        int salavageValue = 1000;
        int usefulLife = 5;

        int depreciationPerYear = (initialCost - salavageValue) / usefulLife;

        System.out.println(depreciationPerYear);

    }
}
