package EcUtbildningKoder;

import java.util.Scanner;

public class TryCatchExempel {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        System.out.println("hur gammal är du");
        //age scan.nextint
        do {

            try {
                age = Integer.parseInt(scan.nextLine());

                //läser in som en sträng för att alla tecken ska fungera vid inläsning
                //Integer klassen läser allt ifrån strängen och konverterar det som kan tillhöra ett heltal till ett heltal
                System.out.println("du är " + age + "år gammal");
            } catch (NumberFormatException e) {
                System.out.println("du måste ange ett tal !!");
            }
        }
        while (age == 0);
    }
    final double pi =Math.PI;

}
