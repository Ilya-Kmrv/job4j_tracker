package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftPart = left.split("/");
        String[] rightPart = right.split("/");
        int result;
        int minLength = Math.min(leftPart.length, rightPart.length);
        for (int i = 0; i < minLength; i++) {

            if (i == 0) {
                result = rightPart[i].compareTo(leftPart[i]);
            } else {
                result = leftPart[i].compareTo(rightPart[i]);
            }

            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(leftPart.length, rightPart.length);
    }
}