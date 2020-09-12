package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift27 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 5;
        int num3 = 10;

        Scanner scan = new Scanner(System.in);
        System.out.println("write three numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is biggest");


        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num3 + " is biggest");
        } else
            System.out.println(num3 + "is biggest");
    }
}
