package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift37 {
    public static void main(String[] args) {

        int num;
        int maxNum = 3;
        int count = 1;


        Scanner scan = new Scanner(System.in);
        System.out.println("write how many numbers to print");
        maxNum = scan.nextInt();

        while (count<maxNum){
            System.out.println("write the number you want to print");
            num = scan.nextInt();
            System.out.println(num);
            count = count +1;

        }

    }
}
