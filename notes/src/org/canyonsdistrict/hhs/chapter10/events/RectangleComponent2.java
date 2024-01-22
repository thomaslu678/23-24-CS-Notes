package org.canyonsdistrict.hhs.chapter10.events;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent2 extends JComponent {

    private Rectangle box;

    public RectangleComponent2() {
        box = new Rectangle (50, 50, 50, 80);
    }

    public void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g;
        g2.draw(box);
    }

    public void move(int x, int y) {
        box.translate(x, y);
    }

}
