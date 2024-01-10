package org.canyonsdistrict.hhs.chapter10;

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

}
