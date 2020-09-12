package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift22 {

    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        num = scan.nextInt();

        if(0<=num && num < 9 && num !=5) {


            System.out.print("Correct");
        }
        else
            System.out.print("Wrong");
    }

}

