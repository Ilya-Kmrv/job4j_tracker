package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenException() {
        Factorial factorial = new Factorial();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    factorial.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Число должно быть больше нуля");
    }

    @Test
    public void whenSuccessfully() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result).isEqualTo(120);
    }
}
