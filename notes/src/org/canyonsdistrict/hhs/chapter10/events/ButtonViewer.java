package org.canyonsdistrict.hhs.chapter10.events;

import javax.swing.*;


public class ButtonViewer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");

        frame.add(button);

        var listener = new ClickListener();
        button.addActionListener(listener);

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
