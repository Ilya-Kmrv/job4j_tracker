package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return x - z;
    }

    public int devide(int q) {
        return q / x;
    }

    public int sumAllOperation(int w) {
        return sum(w) + multiply(w) + minus(w) + devide(w);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("sum: " + Calculator.sum(5));
        System.out.println("minus: " + Calculator.minus(5));
        System.out.println("multiply: " + calculator.multiply(5));
        System.out.println("devide: " + calculator.devide(5));
        System.out.println("sumAllOperation: " + calculator.sumAllOperation(5));
    }
}
