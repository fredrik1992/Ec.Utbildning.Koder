package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift62 {
    public static void main(String[] args) {

        int num;
        int error = 0;
        int count = 0;
        int countNumErrors = 0;

        Scanner scan = new Scanner(System.in);


        while (count < 4) {
            System.out.println("write a num ");
            num = scan.nextInt();
            if (num>5000 ||  num > 10000) {
                error = 1;

            }
            System.out.println(num);
            count++;
        }
        if (error != 0) {
            System.out.println("Wrong");
        } else {
            System.out.println("Right");
        }

    }
}
