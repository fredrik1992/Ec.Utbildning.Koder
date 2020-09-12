package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift13 {

    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("write a number");
        num = scan.nextInt();


        if (num % 2 == 0) {
            System.out.println("The number is even");


        } else {
            System.out.println("The number is odd");
        }

    }

}