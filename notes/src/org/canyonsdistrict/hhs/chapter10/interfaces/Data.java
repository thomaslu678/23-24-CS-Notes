package org.canyonsdistrict.hhs.chapter10.interfaces;

public class Data {

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (var obj : objects) {
            sum += obj.getMeasure();
        }

        if (objects.length > 0) {
            return sum / objects.length;
        }
        else {
            return 0;
        }

    }

    public static double average(Object[] objects, Measurer meas) {
        double sum = 0;
        for (var obj : objects) {
            sum += meas.measure(obj);
        }

        if (objects.length > 0) {
            return sum / objects.length;
        }
        else {
            return 0;
        }

    }

}
