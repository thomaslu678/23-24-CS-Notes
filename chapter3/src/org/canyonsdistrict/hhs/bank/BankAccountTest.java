package org.canyonsdistrict.hhs.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(1000, "Aditya");
        bankAccount.withdraw(100);
        Assertions.assertEquals(900, bankAccount.getBalance());

    }

    @Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(1000, "Aditya");
        bankAccount.deposit(100);
        Assertions.assertEquals(1100, bankAccount.getBalance());

    }

}