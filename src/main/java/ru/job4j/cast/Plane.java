package ru.job4j.cast;

public class Plane implements Vehicle {
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летит");
    }
}
