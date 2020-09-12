package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift56 {
    public static void main(String[] args) {

        int num;
        int median = 0;
        int total = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        total = total + num;


        while (num != 9999) {


            total = total + num;
            count = count + 1;
            num = scan.nextInt();

        }
        if (count != 0) {
            median = total / count;
            System.out.printf(" the median of all the numbers are: %x", median);
        } else {
            System.out.println("to few numbers entered");
        }


    }
}
