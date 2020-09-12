package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift23 {
    public static void main(String[] args) {
        int num, kvot;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        num = scan.nextInt();

        if (num % 3 ==0 && num % 30 != 0) {
            kvot = num / 3;
            System.out.println(kvot);


        }

    }
}
