package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = p -> p.getName().contains(key);
        Predicate<Person> surName = p -> p.getSurname().contains(key);
        Predicate<Person> phone = p -> p.getPhone().contains(key);
        Predicate<Person> address = p -> p.getAddress().contains(key);

        var filter = name.or(surName).or(phone).or(address);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (filter.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
