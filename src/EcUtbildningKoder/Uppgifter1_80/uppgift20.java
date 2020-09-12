package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift20 {

    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        if (0 <= num && num <= 9) {

            System.out.print(num * num);

        } else
            System.out.print("error");


    }

}