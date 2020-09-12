package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift58 {
    public static void main(String[] args) {

        int num;
        int higest;
        int count = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        num = scan.nextInt();
        higest = num;


        while (count < 10) {
            System.out.println("write next number:");
            num = scan.nextInt();
            if (num > higest) {
                higest = num;
            }
            count = count + 1;

        }
        System.out.printf("%x",higest);


    }
}

