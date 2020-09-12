package Atm;

import java.util.Scanner;

public class Terminal {


    public static void choice(Account account) {
        int choice = 1;
        System.out.println("hello " + account.getName());

        while (choice != 0) {
            Scanner scan = new Scanner(System.in);
            ;


            System.out.printf("\n please enter your choice [1]'Withdraw money  [2]Deposit money " +
                    "[3] show ballance [4] to end  ");
            choice = scan.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("write the ammount to Withdraw");
                    account.withdraw(scan.nextInt());
                    break;
                case 2:
                    System.out.println("write the ammount to deposit");
                    account.deposit(scan.nextInt());
                    break;
                case 3:
                    System.out.println(account.getBalance());
                    break;
                case 4:
                    System.out.println("See you soon !");
                    choice = 0;
                    break;
                default:
                    System.out.println("error wrong choice please input the choice again");



            }
        }
    }
}
