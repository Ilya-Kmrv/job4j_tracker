package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает клиента. Каждый клиент имеет Имя и паспорт
 *
 * @author Комаров Илья
 * @version 1.0
 */
public class User {
    /**
     * Паспорт клиента
     */
    private String passport;
    /**
     * Имя клиента
     */
    private String username;

    /**
     * Создание нового клиента
     *
     * @param passport паспорт клиента
     * @param username имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает паспорт клиента
     *
     * @return паспорт клиента
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Устанавливает паспорт для клиента
     *
     * @param passport паспорт клиента
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает имя клиента
     *
     * @return имя клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает имя клиентв
     *
     * @param username имя клиентв
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Сравнивает клинтов по паспорту
     *
     * @param o объект для сравнения
     * @return если обьекты равны - true иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Возвращает хеш код пользователя
     *
     * @return хеш код
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
