package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class Uppgift80 {
    public static void main(String[] args) {

        int[] numbers = new int[2];
        int num;
        int num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("write one numerator and one denominator. ");
        num = scan.nextInt();
        numbers[0] = num;

        num2 = scan.nextInt();
        numbers[1] = num2;

        if (numbers[1] % 2 != 0) {
            numbers[0] *= 2;
            numbers[1] *= 2;
        }


        while (numbers[0] % 2 == 0 && numbers[1] % 2 == 0) {


            numbers[0] /= 2;
            numbers[1] /= 2;

        }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
    }
}

