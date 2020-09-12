package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift8 {

    public static void main(String[] args) {
        int side1,side2,area,circumference;

        Scanner scan = new Scanner(System.in);

        System.out.println("Write the length of side 1");
        side1 = scan.nextInt();

        System.out.println("Write the length of side 2");
        side2 = scan.nextInt();

        circumference = side1+side1+side2+side2;
        area = side1 * side2;

        System.out.println("circumference is: " + circumference);
        System.out.println("area is: " + area);

    }

}