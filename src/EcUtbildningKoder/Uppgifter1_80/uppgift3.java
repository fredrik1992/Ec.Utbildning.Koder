package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift3 {

    public static void main(String[] args) {
        int hours,minutes,seconds;


        Scanner scan = new Scanner (System.in);
        hours = scan.nextInt();
        minutes = hours*60;
        seconds = minutes *60;

        System.out.println(minutes);
        System.out.println(seconds);



    }

}