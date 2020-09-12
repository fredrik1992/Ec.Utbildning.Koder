package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift59 {
    public static void main(String[] args) {

        int num;
        int higestNum;
        int lowestNum;
        int count = 1;
        int totalNumbers;


        Scanner scan = new Scanner(System.in);
        System.out.println("write the ammount of numbers you want to input ");
        totalNumbers = scan.nextInt();

        num = scan.nextInt();
        higestNum = num;
        lowestNum = num;

        while (count < totalNumbers) {
            num = scan.nextInt();
            if (num > higestNum) {
                higestNum = num;
            }
            if (num < lowestNum) {
                lowestNum = num;
            }
            count++;

        }
        System.out.printf("the higest num is [%x] and lowest [%x]",higestNum,lowestNum);
    }
}

