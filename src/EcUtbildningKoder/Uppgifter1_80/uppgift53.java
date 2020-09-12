package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift53 {
    public static void main(String[] args) {
        int num, n;
        int max = 10000;
        int count = 0;
        int total = 0;
        int median = 0;


        Scanner scan = new Scanner(System.in);

        System.out.println("write the value of n ");
        n = scan.nextInt();

        while (count < 10) {
            num = scan.nextInt();
            if (5000 <= num && num < n && num < max) {
                total = total + num;
                count = count + 1;

            }
        }

        median = total / 10;

        System.out.println(total);
        System.out.println(median);


    }
}
