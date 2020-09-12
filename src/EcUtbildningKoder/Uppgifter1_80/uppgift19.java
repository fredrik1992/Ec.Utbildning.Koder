package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift19 {

    public static void main(String[] args) {

        int workTime, payPerHour, overtime, overtimePay;
        double salary;

        Scanner scan = new Scanner(System.in);
        System.out.println("give worktime and pay per hour: ");
        workTime = scan.nextInt();
        payPerHour = scan.nextInt();

        if (workTime > 40) {
            overtime = workTime - 40;
            overtimePay = overtime * payPerHour;
            salary = 40 * payPerHour + overtimePay * 1.5;

        } else {
            salary = workTime * payPerHour;
        }
        System.out.print(salary);


    }

}
