package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift2 {

    public static void main(String[] args) {
        int sales;
        double salary = 8000;
        double interest = 0.09;

        Scanner scan = new Scanner(System.in);
        sales = scan.nextInt();
        salary = salary + (sales * (interest +1));

        System.out.print(salary);
    }



    }

