package conditionalsLoops.advance;

import java.util.Scanner;

//
public class CalculateElectricityBill {

    public static void main(String[] args) {


//        formula Electricity Bill=(Electricity Consumption×Rate per kWh)+Fixed Charges


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Electricity Consumption : ");
        double electricityConsumption = sc.nextDouble();

        System.out.println("Enter Rate per kWh : ");
        double ratePerkWh = sc.nextDouble();

        System.out.println("Enter Fixed Charges : ");
        double fixedCharges = sc.nextDouble();


        double electricityBill = (electricityConsumption * ratePerkWh) + fixedCharges;

        System.out.println("Your electricity bill = " + electricityBill);


    }


}
