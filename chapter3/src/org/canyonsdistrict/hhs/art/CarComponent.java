package org.canyonsdistrict.hhs.art;

import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent {

    public void paintComponent(Graphics g){
        var g2 = (Graphics2D) g;
        var car1 = new Car(0, 0);

        int x = getWidth() - 60;
        int y = getHeight() - 30;

        var car2 = new Car(x, y);
        car1.draw(g2);
        car2.draw(g2);

    }

}
