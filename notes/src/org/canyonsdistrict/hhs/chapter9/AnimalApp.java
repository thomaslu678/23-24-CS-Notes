package org.canyonsdistrict.hhs.chapter9;

public class AnimalApp {

    public static void main(String[] args) {

        Animal cat = new Cat("bob", 12);
        System.out.println("Created: " + cat);
        System.out.println(cat.eat("grass"));

        Animal cat2 = cat;
        System.out.println(cat2.equals(cat));

        Animal cat3 = new Cat("bob", 12);
        System.out.println(cat3.equals(cat));

        Animal cat4 = new Cat("Jim", 11);
        System.out.println(cat4.equals(cat));

    }

}
