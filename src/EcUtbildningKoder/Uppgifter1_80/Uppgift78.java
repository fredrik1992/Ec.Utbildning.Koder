package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;
//reads täljare and nämnare anc checks if nämnare is not 0 otherwhise add both to numbers array

public class Uppgift78 {
    public static void main(String[] args) {

        int[] numbers = new int[2];
        int num;
        int num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("write one numerator and one denominator. the denominator cant be '0' cancel with 0 in first number ");
        num = scan.nextInt();


        while (num != 0) {

            numbers[0] = num;


            num2 = scan.nextInt();

            if (num2 != 0) {
                numbers[1] = num2;
                System.out.printf("%d is the numerator and %d is the denominator%n", numbers[0], numbers[1]);
            } else {
                System.out.printf("Error denominator cant be %d%n", num2);
            }
            System.out.println("write one numerator and one denominator. the denominator cant be '0' cancel with 0 in first ");
            num = scan.nextInt();

        }
    }
}