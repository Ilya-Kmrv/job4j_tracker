package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {

    public static List<Integer> convert(Integer[][] matrix) {
        //return new ArrayList<>();
        return (
                Stream.of(matrix)
                        .flatMap(array -> Arrays.stream(array))
                        .collect(Collectors.toList()));

    }
}


//2. При решении этой задачи нужно использовать методы flatMap(), collect(), Stream.of().
//1. Вам необходимо реализовать метод, который выполняет преобразование этой матрицы Integer[][] в список чисел List<Integer>. Каркас для реализации представлен ниже: