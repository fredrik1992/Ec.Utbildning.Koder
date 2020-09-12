package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift15 {

    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Write two numbers : ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num1 % num2 == 0) {
            System.out.print(num1 + " is evenly devided by  " + num2);
        }


    }

}