package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftPart = left.split("/");
        String[] rightPart = right.split("/");

        int result = rightPart[0].compareTo(leftPart[0]);
        return result != 0 ? result : left.compareTo(right);
    }
}