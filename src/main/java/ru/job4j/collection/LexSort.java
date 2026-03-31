package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftPart = left.split("\\.");
        String[] rightPart = right.split("\\.");
        String leftNum = leftPart[0];
        String rightNum = rightPart[0];
        int leftNumber = Integer.parseInt(leftNum);
        int rightNumber = Integer.parseInt(rightNum);
        return Integer.compare(leftNumber, rightNumber);
    }
}