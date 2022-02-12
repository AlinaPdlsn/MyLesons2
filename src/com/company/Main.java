package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int i = 100;
        System.out.println(i);

        //this my first obj
        CreditCard monobank = new CreditCard();
        monobank.balance = 120000.50;
        System.out.println(monobank.getBalance());


    }
}
