package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class Uppgift79 {
    public static void main(String[] args) {

        int[] numbers = new int[2];
        int num;
        int num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("write one numerator and one denominator. the denominator cant be '0' cancel with 0 in first number ");
        num = scan.nextInt();
        numbers[0] = num;

        num2 = scan.nextInt();
        numbers[1] = num2;

        if (num2<0){
            numbers[0] = numbers[0] * -1;
            numbers[1] = numbers[1] * -1;
        }
        System.out.printf("The numerator is %d and the denominator is %d",numbers[0],numbers[1]);




    }
}
