package org.canyonsdistrict.hhs.memory;

import java.awt.*;

public class ObjectTester {

    public static void main(String[] args) {

        var box = new Rectangle(10, 10, 10, 10);
        var box2 = box;

        if (box == box2) {
            System.out.println("The objects are the same.");
        }
        else {
            System.out.println("The objects are not the same.");
        }

        var box3 = new Rectangle(10, 10, 10,  10);

        if (box == box3) {
            System.out.println("The objects are the same.");
        }
        else {
            System.out.println("The objects are not the same.");
        }

        if (box.equals(box3)) {
            System.out.println("Contents are the same.");
        }
        else {
            System.out.println("Contents are not the same.");
        }

    }

}
