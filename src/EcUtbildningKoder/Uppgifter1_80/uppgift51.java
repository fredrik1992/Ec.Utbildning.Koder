package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift51 {
    public static void main(String[] args) {
        int num;
        int count = 0;
        int numbersOfSeven = 0;

        Scanner scan = new Scanner(System.in);



        while (count < 5) {
            System.out.println("write the  number ");
            num = scan.nextInt();

            if (num == 7) {

                numbersOfSeven=numbersOfSeven +1;
            }
            count = count + 1;


        }
        System.out.println(numbersOfSeven);

    }
}
