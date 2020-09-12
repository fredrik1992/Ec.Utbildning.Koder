package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift30 {
    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        num = scan.nextInt();


        if (num < 100) {
            if (num < 10) {
                System.out.println("the number is less then 10");
            } else
                System.out.println("the number is less then 100");


        } else
            System.out.println("the number is atleast 100");

    }

}



