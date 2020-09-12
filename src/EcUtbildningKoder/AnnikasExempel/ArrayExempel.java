package EcUtbildningKoder.AnnikasExempel;

import java.util.Scanner;

//Author Fredrik Granath
//Datum:??
//Denna koden skaparen array och visar hur vi kan gå igenom den
//på varje index position och sätta värdet för att sedan använda det.

public class ArrayExempel {

    public static void main(String[] args) {

        int[] talvekt = new int[5]; //datatyp[] namn allokera med new datatyp[antal]
        //initierar en vektorarray av typen int

        Scanner scan = new Scanner(System.in);

        int index = 0;
        int summa;

        while (index < 5) {//går igenom arrayns indexpostioner 0-4. och lägger till
            //  en integer på varje position
            talvekt[index] = scan.nextInt();
            index++;
        }
        summa = 0;
        index = 0;

        while (index < 5) {//går igenom index positonerna igen och adderar alla itegers till
            //variablen summa
            summa += talvekt[index];
            index++;
        }
        System.out.print(summa);
    }
}
