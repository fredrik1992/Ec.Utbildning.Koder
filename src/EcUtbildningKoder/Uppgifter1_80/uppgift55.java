package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift55 {

    public static void main(String[] args) {

        int num;
        int biggestNum = 0;
        int nextBiggestNum = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        while (count < 5) {
            num = scan.nextInt();

            if (num > biggestNum) {
                nextBiggestNum = biggestNum;
                biggestNum = num;
            }
            else if (num>nextBiggestNum && num!=biggestNum){
                nextBiggestNum = num;

            }
            count++;
        }
        System.out.printf("%x is the biggest number\n",biggestNum);
        System.out.printf("%x is the next biggest number",nextBiggestNum);

    }

}
