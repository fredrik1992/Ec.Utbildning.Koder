package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift31 {
    public static void main (String[] args){
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("write a number");
        num = scan.nextInt();

        while(num !=0){
            System.out.println(num + " please write a new number");
            num = scan.nextInt();




        }
        System.out.println("0");
        // syntax  variabel svar = (tal>10)?true:false
    }
}
