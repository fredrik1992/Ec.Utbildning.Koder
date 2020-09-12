package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class Uppgift66 {

    public static void main(String[] args) {
        String[] personNumber = {"1", "9", "9", "2", "0", "7", "2", "2", "-", "0", "0", "5", "5"};
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < personNumber.length; i++) {


            if (personNumber[8] != "-") {
                System.out.println("error");
                i = personNumber.length - 1;

            }


        }


    }
}
