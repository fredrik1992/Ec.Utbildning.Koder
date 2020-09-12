package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift52 {
    public static void main(String[] args) {
        int num;
        int total = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        while (count < 5) {
            num = scan.nextInt();

            if (num > 0) {
                total = total + num;
            }
            count = count + 1;
        }
        System.out.println(total);


    }


}
