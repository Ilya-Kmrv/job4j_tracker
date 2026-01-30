package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] temp = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                temp[count++] = items[index];
            }
        }
        return Arrays.copyOf(temp, count);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }
    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
    }

    public static void main(String[]args) {
            String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor"};
            System.arraycopy(names, 2, names, 1, 3);
            System.out.println(Arrays.toString(names));
        }

        private int indexOf(int id) {
            for (int index = 0; index < size; index++) {
                if (items[index].getId() == id) {
                    return index;
                }
            }
            return -1;
        }
    }
