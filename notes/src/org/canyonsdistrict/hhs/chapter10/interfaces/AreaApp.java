package org.canyonsdistrict.hhs.chapter10.interfaces;

import java.awt.*;

public class AreaApp {

    class WidthMeasurer implements Measurer {

        @Override
        public double measure(Object anObject) {
            var rect = (Rectangle) anObject;
            return rect.getWidth();
        }

    }

    public static void main(String[] args) {

        var rectangles = new Rectangle[] {

                new Rectangle(10, 10, 20, 40),
                new Rectangle(56, 77, 100, 12),
                new Rectangle(0, 0, 80, 44)

        };

        var areaMeasurer = new AreaMeasurer();
        double averageArea = Data.average(rectangles, areaMeasurer);
        System.out.println(averageArea);

        Measurer lengthMeasurer = (Object obj) -> ((Rectangle)obj).getWidth();
        double averageLength = Data.average(rectangles, lengthMeasurer);

        Measurer areaMeas = (Object obj) -> {
            var rect = (Rectangle)obj;
            return rect.getWidth() * rect.getHeight();
        };


        double averageWidth = Data.average(rectangles, new Measurer() {

            @Override
            public double measure(Object anObject) {
                var rect = (Rectangle) anObject;
                return rect.width;
            }

        });

    }



}
