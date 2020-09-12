package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift57 {
    public static void main(String[] args) {

        int liter = 1;
        int miles = 0;
        double literPerRefuel = 0;
        int totalMiles = 0;
        int totalLiter = 0;
        double median = 0;

        Scanner scan = new Scanner(System.in);


        while (liter != 0) {
            liter = scan.nextInt();
            if (liter != 0) {
                miles = scan.nextInt();
            }
            if (miles != 0 && liter != 0) {
                literPerRefuel = (double) miles / liter;
                System.out.printf("this refuling got you %f : miles per liter", literPerRefuel);


            }
            totalMiles = totalMiles + miles;
            totalLiter = totalLiter + liter;


        }


        if (totalMiles == 0 || totalLiter == 0) {
            System.out.println("Not a complete drive ");
        } else {
            median = (double) totalLiter / totalMiles;
            System.out.printf("your total fuel per total miles is :%f", median);
        }


    }
}
