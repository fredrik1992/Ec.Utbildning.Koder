package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift26 {

    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("write two numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "is biggest");
        }
        else{
            if (num2 > num1) {
                System.out.println(num2 + " is biggest");
            } else
                System.out.println("the numbers are even");
        }

    }
}
