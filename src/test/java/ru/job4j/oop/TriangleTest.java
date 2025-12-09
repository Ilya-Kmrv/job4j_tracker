package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when01and41and04Then8() {
        Point a = new Point(0, 1);
        Point b = new Point(4, 1);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 6;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when11and32and15Then8() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 2);
        Point c = new Point(1, 5);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 4;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}
