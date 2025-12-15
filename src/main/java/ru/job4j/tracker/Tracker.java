package ru.job4j.tracker;

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
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        for (int index = 0; index < size; index++) {
            result[index] = items[index];
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] temp = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                temp[count++] = item;
            }
        }
        Item[] result = new Item[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
