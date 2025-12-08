package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball) {
        System.out.println("Я волк, я тебя съем");
        ball.tryRun(false);
    }
}
