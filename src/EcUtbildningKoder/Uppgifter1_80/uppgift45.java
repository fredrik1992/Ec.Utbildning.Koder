package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift45 {
    public static void main(String[] args) {
        int maxTotal = 1000000;
        int num;
        int count = 1;
        int numTotal = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("write the term to check how many times it needs to be added");
        num = scan.nextInt();

        while (numTotal <maxTotal) {

            numTotal = numTotal + num;
            count = count + 1;
        }
        System.out.println(count);
    }
}
