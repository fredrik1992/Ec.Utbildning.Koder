package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift11 {

    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("write the first number: ");
        num1 = scan.nextInt();

        System.out.println("write the second number");
        num2 = scan.nextInt();


        if (num1 > num2) {
            System.out.println("the first number is the biggest");

        }

    }

}