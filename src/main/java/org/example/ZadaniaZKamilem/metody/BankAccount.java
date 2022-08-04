package org.example.ZadaniaZKamilem.metody;

public class BankAccount {

    int number;
    double cash;

    public BankAccount() {
        this.cash = 0;
    }

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    void depositCash(double amount) {

        if (amount != 0) {
             this.cash = this.cash + amount;
        }
    }

    double withdrawalCash(double amount) {

        if (amount > 0 && amount < this.cash) {
            this.cash = this.cash - amount;
        } else if ((this.cash - amount) < 0) {
            amount = this.cash;
        }

        return amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", cash=" + cash +
                '}';
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(1234);
        System.out.println(acc1.toString());

        acc1.depositCash(100);
        System.out.println(acc1.toString());

        acc1.withdrawalCash(50);
        System.out.println(acc1.toString());

        acc1.withdrawalCash(60);
        System.out.println(acc1.toString());

        BankAccount acc2 = new BankAccount(5555);
        acc2.depositCash(1000);
        System.out.println(acc2.toString());

        acc2.withdrawalCash(500);
        System.out.println(acc2.toString());

        acc2.withdrawalCash(250);
        System.out.println(acc2.toString());

        acc2.withdrawalCash(300);
        System.out.println(acc2.toString());

        acc2.depositCash(300);
        System.out.println(acc2.toString());

    }


}
