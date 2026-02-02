package ru.job4j.cast;

public class Bus implements Vehicle {
    public void move() {
        System.out.println(getClass().getSimpleName() + " Идет по городскому маршруту");
    }
}
