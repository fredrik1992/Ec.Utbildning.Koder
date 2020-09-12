package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class Uppgift77 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Scanner scan = new Scanner(System.in);


        for (int index = 0; index < 10; index++) {
            numbers[index] = scan.nextInt();

        }
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.printf("%d%n", numbers[index]);


        }


    }
}
