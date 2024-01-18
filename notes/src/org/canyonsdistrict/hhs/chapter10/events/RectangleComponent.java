package org.canyonsdistrict.hhs.chapter10.events;

import java.awt.*;

public class RectangleComponent extends Component {

    private Rectangle box;

    public RectangleComponent() {
        box = new Rectangle(0, 0, 50, 50);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }

    public void move (int dx, int dy) {
        box.translate(dx, dy);
        repaint();
    }

}
