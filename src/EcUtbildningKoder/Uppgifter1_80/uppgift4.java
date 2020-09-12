package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift4 {

    public static void main(String[] args) {
        int num1,num2,num3,result;
        double median;

        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        result = num1+num2+num3;
        median = (double)result/3;

        System.out.println(result);
        System.out.println(median);


    }

}