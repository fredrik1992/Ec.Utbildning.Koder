package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift54 {

    public static void main(String[] args) {
        int num;
        int totalPositive = 0;
        int totalNegative = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        while (count < 5) {

            System.out.println("write a number: ");
            num = scan.nextInt();

            if (num > 0) {
                totalPositive = totalPositive + 1;
            }
            else if (num < 0) {
                totalNegative = totalNegative + 1;

            }
            count = count + 1;
        }
        System.out.printf("the total of all the negative numbers:\n%x\n", totalNegative);
        System.out.printf("the total of all the positive numbers:\n%x", totalPositive);
    }
}
