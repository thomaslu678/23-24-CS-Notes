package org.canyonsdistrict.hhs.chapter14;

public class Person implements Comparable<Person>{

    private int age;


    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }


}
