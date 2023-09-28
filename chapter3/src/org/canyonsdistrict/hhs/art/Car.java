package org.canyonsdistrict.hhs.art;

import javax.sound.sampled.Line;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {

    private int x;
    private int y;

    public Car(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2){
        var body = new Rectangle(x, y+10, 60, 10);
        var frontTire = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
        var backTire = new Ellipse2D.Double(x + 40, y + 20, 10, 10);
        var frontWindshield = new Line2D.Double(x+10, y+10, x+20, y);
        var backWindshield = new Line2D.Double(x+40, y, x+50, y+10);
        var roof =  new Line2D.Double(x + 20, y, x + 40, y);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(backTire);
        g2.draw(frontWindshield);
        g2.draw(backWindshield);
        g2.draw(roof);
    }

}
