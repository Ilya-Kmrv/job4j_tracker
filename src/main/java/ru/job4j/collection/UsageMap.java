package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("komarof19@yandex.ru", "Komarov Ilya");
        map.put("komarof18@yandex.ru", "Komarov Maxim");
        map.put("komarof18@yandex.ru", "Komarov Max");
        map.put("komarof17@yandex.ru", "Komarov Nik");
        map.put("komarof17@yandex.ru", "Komarov Nikolas");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
