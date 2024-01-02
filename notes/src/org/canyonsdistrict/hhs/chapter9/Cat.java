package org.canyonsdistrict.hhs.chapter9;

public class Cat extends Animal{

    public Cat (String name, int age) {
        super(name, age);
    }

    @Override
    public String eat(String what) {
        return String.format("Ripping apart %s", what);
    }

    public String toString() {
        return "Cat[name=" + getName() + ", age=" + getName() + "]";
    }



}
