package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Мы начинаем движение.Пристегнитесь.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров: " + count);
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Заправка: " + fuel + " P");
        return fuel;
    }
}
