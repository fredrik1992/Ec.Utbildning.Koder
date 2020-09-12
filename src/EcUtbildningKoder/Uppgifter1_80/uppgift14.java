package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift14 {

    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println();
        num = scan.nextInt();


        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

}