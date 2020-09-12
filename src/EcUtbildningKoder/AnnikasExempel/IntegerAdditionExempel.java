package EcUtbildningKoder.AnnikasExempel;//Author:Fredrik Granath
//Datum:??
//Denna koden skapar två integers och aderar deras värden.

import java.util.Scanner;

public class IntegerAdditionExempel {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scan = new Scanner(System.in);

        System.out.println("mata in 2 tal");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        sum = num1 + num2;

        System.out.println(sum);


    }
}
