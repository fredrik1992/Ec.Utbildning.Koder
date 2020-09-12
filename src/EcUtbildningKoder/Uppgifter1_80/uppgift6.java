package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift6 {
    public static void main(String[] args) {
        int a, x, total;

        Scanner scan = new Scanner(System.in);
        System.out.println("write two numbers ");
        a = scan.nextInt();
        x = scan.nextInt();
        total = a * x * x * x * x + 7;

        System.out.println(total);
    }
}
