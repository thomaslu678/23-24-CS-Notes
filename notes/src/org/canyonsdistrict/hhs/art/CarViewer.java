package org.canyonsdistrict.hhs.art;

import javax.swing.*;

public class CarViewer {

    public static void main(String[] args) {

        var frame = new JFrame("2 cars");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        var car = new CarComponent();
        frame.add(car);

        frame.setVisible(true);


    }

}
