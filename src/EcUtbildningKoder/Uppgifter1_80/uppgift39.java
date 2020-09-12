package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift39 {
    public static void main(String[] args) {
        double price;
        double moms = 0.10;

        Scanner scan = new Scanner(System.in);
        System.out.println("write the price");
        price = scan.nextInt();

        while (price != 0) {
            price = price * (1 + moms);
            System.out.printf("%.2f`\n", price);
            System.out.println("write next number");
            price = scan.nextInt();
        }
    }
}
