package org.canyonsdistrict.hhs.chapter10.events;

import javax.swing.*;
import java.awt.event.*;

public class RectangleFrame2 extends JFrame {

    private RectangleComponent2 component;

    class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            var key = KeyStroke.getKeyStrokeForEvent(e).toString();
            System.out.printf("Pressed: %s", key);
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    class MousePressListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            var x = e.getX();
            var y = e.getY();

            component.move(x, y);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public RectangleFrame2() {
        component = new RectangleComponent2();
        add(component);

        var listener = new MousePressListener();
        component.addMouseListener(listener);

        var keyListener = new MyKeyListener();
        component.addKeyListener(keyListener);

        component.setFocusable(true);
        component.requestFocus();

        setSize(400, 400);

    }

}
