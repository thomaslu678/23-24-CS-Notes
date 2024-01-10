package org.canyonsdistrict.hhs.chapter10;

public interface Measurable {

    String UNIT = "some unit";

    double getMeasure();

    static double average(Measurable[] objects) {
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

    default String getMeasureValueType() {
        return "Measured by my double value";
    }


}
