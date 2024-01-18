package org.canyonsdistrict.hhs.chapter10.events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleFrame extends JFrame {

    private RectangleComponent component;

    class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            component.move(1, 1);
        }
    }

    public RectangleFrame() {
        component = new RectangleComponent();
        add(component);
        setSize(600, 600);

        var listener = new TimerListener();
        final int DELAY = 10;
        var timer = new Timer(DELAY, listener);
        timer.start();

    }
}
