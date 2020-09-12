package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift18 {

    public static void main(String[] args) {
        int x,y,a;

        Scanner scan = new Scanner(System.in);
        System.out.println("write two numbers");

        x= scan.nextInt();
        y= scan.nextInt();


        a = (x>y+5)?2:5;
        System.out.print(a);

    }

}// syntax  variabel svar = (tal>10)?true:false