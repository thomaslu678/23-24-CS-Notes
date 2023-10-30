package org.canyonsdistrict.hhs.conditionals;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        var person = new Person();
        person.setName("Bob");
        if (person.getName() != null){
            System.out.println(person.getName());
            System.out.println(person.getName().length());
        }

    }

}
