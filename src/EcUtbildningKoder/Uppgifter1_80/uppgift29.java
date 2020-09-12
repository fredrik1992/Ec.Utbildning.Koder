package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift29 {

    public static void main(String[] args) {
        int leaveHour,leaveMinute,driveHours,driveMinutes;
        int arrivalHours;
        int arrivalMinutes;

        Scanner scan = new Scanner(System.in);
        System.out.println("write the trains leave hour then leave minute");
        leaveHour = scan.nextInt();
        leaveMinute = scan.nextInt();

        System.out.println("write the trains drive hour then drive minute");
        driveHours = scan.nextInt();
        driveMinutes = scan.nextInt();

        arrivalHours = leaveHour + driveHours;
        arrivalMinutes = leaveMinute + driveMinutes;

        if (arrivalMinutes >=60){
            arrivalMinutes = arrivalMinutes -60;
            arrivalHours = arrivalHours +1;

        }
        if (arrivalHours >=24){
            System.out.println("Next day");
            arrivalHours = arrivalHours -24;
        }
        System.out.println(arrivalHours );
        System.out.println(arrivalMinutes);


    }
}

