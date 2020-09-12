package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift12 {

    public static void main(String[] args) {
        int num1,num2 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("write the first number");
        num1 = scan.nextInt();

        System.out.println("write the second number");
        num2 = scan.nextInt();

        if (num1> num2*2) {
            System.out.print("The number is to big");
        }

    }

}
