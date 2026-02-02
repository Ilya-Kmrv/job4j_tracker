package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle airbus = new Plane();
        Vehicle sukhoiSJ = new Plane();
        Vehicle lastochka = new Train();
        Vehicle burevestnik = new Train();
        Vehicle ikarus = new Bus();
        Vehicle elektrobus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{airbus, sukhoiSJ, lastochka, burevestnik, ikarus, elektrobus};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}
