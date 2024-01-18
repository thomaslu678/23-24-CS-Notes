package org.canyonsdistrict.hhs.chapter10.events;

import org.canyonsdistrict.hhs.chapter10.interfaces.BankAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentApp {

    private static final double INTEREST_RATE = 5;
    private static final double INITIAL_BALANCE = 15000;

    public static void main(String[] args) {

        var frame = new JFrame();
        var button = new JButton("Calculate interest");

        var account = new BankAccount(INITIAL_BALANCE);
        var label = new JLabel("Balance: " + account.getBalance());

        var panel = new JPanel();
        panel.add(label);
        frame.add(panel);

//        class AddInterestListener implements ActionListener {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                double interest = account.getBalance() * INTEREST_RATE / 100;
//                account.deposit(interest);
//                System.out.println("Balance: " + account.getBalance());
//            }
//        }
//
//        var listener = new AddInterestListener();

        button.addActionListener(

                (ActionEvent event) -> {

                    double interest = account.getBalance() * INTEREST_RATE / 100;
                    account.deposit(interest);
                    label.setText("Balance: " + account.getBalance());

                }

        );
        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
