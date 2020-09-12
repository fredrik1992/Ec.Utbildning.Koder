package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift28 {
    public static void main (String[] args){
        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("write two numbers");
        temp = scan.nextInt();


        if (temp>=18 && temp<=25){
            System.out.println("even temp");

        }
        else if (temp >25){
            System.out.println("to hot");



        }
        else
            System.out.println("to cold");

    }
}
