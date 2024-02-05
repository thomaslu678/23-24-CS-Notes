package org.canyonsdistrict.hhs.chapter11;

import java.util.Scanner;

public class BankAccountApp {

    public static void main(String[] args) {

        var account = new BankAccount(100);
        Scanner in = new Scanner(System.in);
        var amount = in.nextDouble();

        try {
            account.withdraw(amount);
            account.withdraw(amount);

        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        catch (WithdrawLimitExceededException e) {
            System.out.println("Exceeded withdrawal limit");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Got here!");
        }

    }

}
