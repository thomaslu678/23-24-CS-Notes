package org.canyonsdistrict.hhs.chapter10.interfaces;

import java.awt.*;

public class AreaMeasurer implements Measurer{

    @Override
    public double measure(Object anObject) {
        var rect = (Rectangle) anObject;
        return 0;
    }

}
