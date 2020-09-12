package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift34 {
    public static void main (String[] args){




        Scanner scan = new Scanner(System.in);
        char sign = scan.next().charAt(0);


        while (sign != '-'){
            System.out.print(sign);
            System.out.println("write next string");
            sign = scan.next().charAt(0);

        }
        System.out.println("stop");
    }
}
