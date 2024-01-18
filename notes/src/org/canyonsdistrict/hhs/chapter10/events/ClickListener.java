package org.canyonsdistrict.hhs.chapter10.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("SUCCESS!");
    }
}
