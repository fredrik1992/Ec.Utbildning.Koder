package EcUtbildningKoder.AnnikasExempel;

import java.util.Scanner;

//Author:Fredrik Granath
//Datum:??
//En kod som visar hur en class ska deklareras
public class KlassdeklarationExempel {//klassdeklaration

    public static void main(String[] args) {
        int[] num = new int[10];
        System.out.println("Skriv in 10 stycken tal");
        Scanner scan = new Scanner(System.in);

        for (int i = 9; i >= 0; i--) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }

    }
}
