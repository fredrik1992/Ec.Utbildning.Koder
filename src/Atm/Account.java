package Atm;

import java.util.Scanner;


public class Account {
    private String name;
    private double balance;

    public Account(){
        setName("none");
        setBalance(0);
    }

    public Account(String name, double balance) {
        setName(name);
        setBalance(balance);
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }



    public void setName(String name){
        this.name = name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void withdraw(int withdrawAmmount) {


        if (withdrawAmmount <= this.balance) {
            this.balance -= withdrawAmmount;
            System.out.printf("%d was withdrawn ", withdrawAmmount);
        } else {
            System.out.println("sorry your balance dosent cover that ammount");

        }


    }

    public void deposit(int depositAmmount) {

        this.balance += depositAmmount;
        System.out.printf("%d was deposited into your balance", depositAmmount);
    }

    public double getBalance() {
        return balance;
    }
}
