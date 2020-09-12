package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift16 {

    public static void main(String[] args) {

        int units,pricePerUnit;
        double total,discount,discountTotal;

        Scanner scan = new Scanner(System.in);
        System.out.println("write the ammount of units: ");
        units = scan.nextInt();

        System.out.println("Write the price per unit: ");
        pricePerUnit = scan.nextInt();

        System.out.println("Write the discount: ");
        discount = scan.nextInt();


        total = units*pricePerUnit;
        discountTotal = (discount/100) * total;

        if (total >=1000) {
            total = total - discountTotal;
        }
        System.out.print(total);


    }

}