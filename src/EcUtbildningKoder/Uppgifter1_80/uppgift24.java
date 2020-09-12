package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift24 {
    public static void main(String[] args) {
        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("write the temperature");
        temp = scan.nextInt();

        if (temp <= 35 || temp >=  42) {
            System.out.println("Check temp");


        } else
            System.out.println("temp is normal");


    }
}
