package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift9 {

    public static void main(String[] args) {
        double radius, diameter, circumference, area;

        Scanner scan = new Scanner(System.in);

        System.out.println("write the raidus of the circle: ");
        radius = scan.nextDouble();


        diameter = radius + radius;
        circumference = 3.14 * diameter;
        area = 3.14 * (radius * radius);
        System.out.println(diameter);
        System.out.println(circumference);
        System.out.println(area);


    }

}