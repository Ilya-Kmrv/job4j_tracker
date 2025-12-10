package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;  // this. присвоил значение в поле обьекта, а не в локальный параментр (присваивался сам к себе)
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}