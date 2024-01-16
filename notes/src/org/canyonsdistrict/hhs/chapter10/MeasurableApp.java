package org.canyonsdistrict.hhs.chapter10;

import java.util.Arrays;

public class MeasurableApp {

    public static void main(String[] args) {

        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(1000);
        accounts[1] = new BankAccount(540);
        accounts[2] = new BankAccount(26.78);

        Measurable[] countries = new Measurable[3];
        countries[0] = new Country(100);
        countries[1] = new Country(500);
        countries[2] = new Country(10000);

        Measurable[] books = new Measurable[3];
        books[0] = new Book(1000);
        books[1] = new Book(2000);
        books[2] = new Book(40000);

        double averageBalance = Measurable.average(accounts);
        double averagePopulation = Data.average(countries);
        double averageWords = Data.average(books);

        System.out.printf("Average balance: %f", averageBalance);
        System.out.printf("Average population: %f", averagePopulation);
        System.out.printf("Average words: %f", averageWords);

        System.out.printf("Unit: %s", Measurable.UNIT);

        for (var account : accounts) {

            if (account instanceof BankAccount acct) {
                acct.deposit(100);
                System.out.printf("%.2f\n", acct.getBalance());
            }

        }

        System.out.println(Arrays.toString(accounts));
        Arrays.sort(accounts);
        System.out.println(Arrays.toString(accounts));

    }

}
