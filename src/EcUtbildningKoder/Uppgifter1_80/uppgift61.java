package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift61 {
    public static void main(String[] args) {

        int num;
        int num2;
        int count = 1;
        int countNumErrors = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a num ");
        num = scan.nextInt();
        System.out.println(num);

        while (num != 0) {
            System.out.println("write a num");
            num2 = scan.nextInt();
            count = count++;

            if (num2 == 0) {
                num = num2;
            }
            if (num2 > num) {
                System.out.println(num2);
                num = num2;
            }
            if (num2 < num) {
                countNumErrors++;
                System.out.printf("number [%x] was wrong its value is [%x] ", count, num2);

            } else {
                num = num2;


            }


        }
    }
}
