package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift42 {
    public static void main(String[] args) {
        int num;
        int total = 0;
        int count = 1;


        Scanner scan = new Scanner(System.in);
        System.out.println("write one number");
        num = scan.nextInt();

        while (count <= 20) {

            total = total + num;
            count = count + 1;
            System.out.println("write next number to add: ");
            num = scan.nextInt();
        }
        System.out.println(total);


    }
}
