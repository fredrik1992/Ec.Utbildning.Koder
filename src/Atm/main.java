package Atm;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        callToTerminal();


    }

    public static void AccountLoginOrRegister() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("welcome user please choose if you want to [1]Login [2] Register");
        int num = scan.nextInt();
        switch (num) {
            // case1: fixa control imot accountlistan
            case 2:
                AccountCreation.BankAccountName();

        }


    }


    public static Account accountCreation() {
        Account account;
        account = new Account("fredrik", 1000);


        return account;

    }

    public static void callToTerminal() {
        Terminal.choice(accountCreation());//calls on the terminal wich gets an account created in accountcreation

    }


}
