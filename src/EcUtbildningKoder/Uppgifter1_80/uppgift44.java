package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift44 {
    public static void main(String[] args) {
        int maxNum, num;
        int total = 0;
        int count = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("write how many numbers you wanna add");
        maxNum = scan.nextInt();

        while (count <= maxNum) {

            num = scan.nextInt();

            total = total + num;
            count = count + 1;

            System.out.println(total);
        }
    }
}
