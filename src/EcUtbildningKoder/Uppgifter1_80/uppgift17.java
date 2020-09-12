package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int num1, num2, kvot;

        Scanner scan = new Scanner(System.in);
        System.out.println("write two numbers");

        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num2 != 0) {
            kvot = num1 / num2;
            System.out.print(kvot);

        } else {
            System.out.print("Error");

        }
    }

}
