package org.canyonsdistrict.hhs.chapter10.interfaces;

public class Country implements Measurable{

    private long population;

    public Country(long population) {
        this.population = population;
    }

    public double getMeasure() {
        return 0;
    }

    public String getMeasureValueType() {
        return "Measured by my long type";
    }

}
