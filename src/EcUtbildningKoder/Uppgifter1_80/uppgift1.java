package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift1 {

    public static void main(String[] args) {
        int tal;
        int produkt;

        Scanner scan = new Scanner(System.in);
        tal = scan.nextInt();
        produkt = tal + tal;

        System.out.println(produkt);
    }

}
