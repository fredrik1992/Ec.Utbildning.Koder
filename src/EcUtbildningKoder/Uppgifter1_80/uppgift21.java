package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift21 {

    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        num = scan.nextInt();


        if (num < -10 || num > 10) {

            System.out.print(" the number is atleast two digits long");

        }

    }

}