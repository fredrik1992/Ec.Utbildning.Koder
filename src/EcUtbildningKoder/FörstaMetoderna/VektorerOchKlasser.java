//Author:Fredrik Granath
//Datum:??
//Skapar en array med 5 integers och ser vilket som är störst ,minst samt i vilken index
//   position det sista negativa numret finns


package EcUtbildningKoder.FörstaMetoderna;

import java.util.Scanner;

public class VektorerOchKlasser {
    public static void main(String[] args) {
        int highestNum, lowestNum, summa;
        int[] vekt = new int[5];
        readValues(vekt);
        System.out.println("Och innehållet i vektorn är ");

        highestNum = maxNum(vekt);

        summa = summa(vekt);
        System.out.printf("higest num in the vektor is:%d  and lowest:%d and sum is:%d", highestNum, minNum(vekt), summa);


    }

    public static void readValues(int[] v) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5 tal tack!");
        for (int i = 0; i < 5; i++)
            v[i] = scan.nextInt();

    }

    public static int maxNum(int[] vekt) {
        int highNum = vekt[0];

        for (int index = 0; index < vekt.length; index++) {


            if (vekt[index] > highNum) {
                highNum = vekt[index];
            }

        }
        return highNum;


    }

    public static int minNum(int[] vekt) {
        int lowNum = vekt[0];

        for (int index = 1; index < vekt.length; index++) {


            if (vekt[index] < lowNum) {
                lowNum = vekt[index];
            }

        }
        return lowNum;
    }

    public static int summa(int[] vekt) {
        int sum = 0;

        for (int index = 0; index < vekt.length; index++) {
            sum += vekt[index];
        }
        return sum;
    }
}

