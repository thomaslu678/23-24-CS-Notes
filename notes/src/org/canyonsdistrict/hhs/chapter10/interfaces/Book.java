package org.canyonsdistrict.hhs.chapter10.interfaces;

public class Book implements Measurable{

    private int words;

    public Book(int words) {
        this.words = words;
    }

    public double getMeasure() {
        return words;
    }

    public String getMeasureValueType() {
        return "Measured by my int type";
    }

}
