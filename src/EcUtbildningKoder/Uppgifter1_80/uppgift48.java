package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift48 {
    public static void main(String[] args) {
        int n;
        int count = 1;
        int faculty = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("write two numbers");
        n = scan.nextInt();

        while (count <= n) {

            faculty = faculty * count;
            count = count + 1;
        }
        System.out.println(faculty);


    }
}
