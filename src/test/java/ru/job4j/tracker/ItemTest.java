package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {
    @Test
    public void whenSortItemsAscByName() {
        // 1. Создаем список с данными в произвольном порядке
        List<Item> items = Arrays.asList(
                new Item("C1"),
                new Item("A2"),
                new Item("B4"),
                new Item("D5"));
        List<Item> expected = Arrays.asList(
                new Item("A2"),
                new Item("B4"),
                new Item("C1"),
                new Item("D5"));
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenSortItemsDescByName() {
        // 1. Создаем список с данными в произвольном порядке
        List<Item> items = Arrays.asList(
                new Item("C1"),
                new Item("A2"),
                new Item("B4"),
                new Item("D5")
        );
        List<Item> expected = Arrays.asList(
                new Item("D5"),
                new Item("C1"),
                new Item("B4"),
                new Item("A2"));
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}