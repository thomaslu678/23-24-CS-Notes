package org.canyonsdistrict.hhs.chapter9;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String eat(String what);

    public String toString() {
        return "Animal[name=" + name + ", age=" + age + "]";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Animal) {
            Animal other = (Animal) o;
            return name.equals(other.name) && age == other.getAge();
        }
        return false;
    }

}
