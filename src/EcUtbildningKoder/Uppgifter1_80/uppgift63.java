package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift63 {
    public static void main(String[] args) {

        int num, num2;
        int wrong = 0;



        Scanner scan = new Scanner(System.in);
        System.out.println("write the first number");
        num = scan.nextInt();


        while (num != 0) {
            System.out.println("write the second number");

            num2 = scan.nextInt();
            if (num2 != 0) {
                if (num2 > num) {
                    System.out.println(num2);
                } else {
                    wrong = 1;
                    num2 =0;
                }

            }


            num = num2;
        }
        if (wrong != 0) {

            System.out.println("error in sorting order");
        }

    }
}
