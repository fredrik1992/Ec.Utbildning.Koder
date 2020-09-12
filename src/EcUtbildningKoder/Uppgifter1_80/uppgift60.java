package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift60 {

    public static void main(String[] args) {

        int num;
        int num2;
        int evenNums = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a num ");
        num = scan.nextInt();


        while (num != 0) {
            System.out.println("Write a num");
            num2 = scan.nextInt();

            if (num2 == 0) {
                num = num2;
            }
            if (num2 == num && num2 !=0) {
                evenNums++;
                num = num2;


            } else {
                num = num2;
            }


        }
        System.out.printf("the number of times a number next to another was equal to each other was [%x]",evenNums);

    }


}
