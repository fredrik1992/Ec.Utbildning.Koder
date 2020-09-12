package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift25 {
    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("write nummer");
        num = scan.nextInt();

        if (num < 0) {
            System.out.println("the number is negative");
        } else {
            if (num > 0) {
                System.out.println("the number is positive");

            }
        }
    }
}
