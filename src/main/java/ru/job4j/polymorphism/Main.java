package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.move();
        bus.passengers(22);
        int cost = bus.refuel(5000);
    }
}
