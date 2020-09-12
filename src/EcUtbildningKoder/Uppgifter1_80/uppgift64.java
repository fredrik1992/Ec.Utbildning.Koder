package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift64 {
    public static void main(String[] args) {

        int num, num2;
        int count = 1;
        int big;
        int nextBig;


        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        num = scan.nextInt();
        big = num;
        nextBig = num;

        while (count < 4) {
            System.out.println("write a number");
            num2 = scan.nextInt();
            if (num2 > big) {

                nextBig = big;
                big = num2;

            } else if (num2 > nextBig && num2 != big) {
                nextBig = num2;
            }
            count++;


        }
        System.out.printf("the bigest number is [%d] and the lowest number is [%d]", big, nextBig);

    }
}
