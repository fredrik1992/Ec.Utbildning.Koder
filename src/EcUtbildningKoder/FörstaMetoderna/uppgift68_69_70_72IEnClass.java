//Author:Fredrik Granath
//Datum:9September 2020
//uppgift 60,69,70,72 har lagts i hopa till en class i olika metoder.

package EcUtbildningKoder.FörstaMetoderna;

import java.util.Scanner;

public class uppgift68_69_70_72IEnClass {

    public static void main(String[] args) {
        int[] vekt = new int[10];

        readValues(vekt);

        uppgift68(vekt);

        System.out.printf("number of positve nums is %d and the last negative index positon is:%d", uppgift70(vekt), uppfit72(vekt));


    }

    public static void readValues(int[] v) {
        Scanner scan = new Scanner(System.in);
        System.out.println("10 tal tack!");
        for (int i = 0; i < v.length; i++)
            v[i] = scan.nextInt();

    }

    public static void uppgift68(int[] vekt) {

        for (int i = 0; i < vekt.length; i++) {
            vekt[i] *= 2;

        }


    }

    public static void uppgift69(int[] vekt) {

        for (int i = 0; i < vekt.length; i = i + 2) {
            vekt[i] *= 2;


        }
    }

    public static int uppgift70(int[] vekt) {
        int positive = 0;

        for (int i = 0; i < vekt.length; i++) {
            if (vekt[i] > 0) {
                positive++;
            }
        }
        return positive;
    }

    public static int uppfit72(int[] vekt) {
        int firstNeg = -1;// om den är -1 så vet jag att det inte är något number
        int last = vekt.length - 1;


        for (int index = last; index >= 0; index--) {


            if (vekt[index] < 0) {
                firstNeg = index;
                index = 0;
            }

        }
        return firstNeg;

    }
}



