package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift36 {
    public static void main(String[] args) {

        double interest;
        int year = 1;
        double account = 1000;

        Scanner scan = new Scanner(System.in);
        System.out.println("write the interest ");
        interest = scan.nextDouble();





        while ( year <10){

            account = account * (1+interest/100) ;
            year =year+1;
            System.out.println(account);
        }
        System.out.printf("%.2f",account);



    }

}
