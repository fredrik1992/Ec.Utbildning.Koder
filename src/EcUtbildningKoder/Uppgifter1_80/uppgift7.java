package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift7 {

    public static void main(String[] args) {
        int liter, costPerLiter, discountInPercent, grossPrice;
        double netCost;


        Scanner scan = new Scanner(System.in);
        System.out.println("write liter ammount: ");
        liter = scan.nextInt();

        System.out.println("Write the cost per liter: ");
        costPerLiter = scan.nextInt();

        System.out.println("write the discount in percent: ");
        discountInPercent = scan.nextInt();

        grossPrice = liter * costPerLiter;
        netCost = grossPrice - (((double) discountInPercent / 100) * grossPrice);//deducts the discount from gross price

        System.out.print(netCost);


    }

}