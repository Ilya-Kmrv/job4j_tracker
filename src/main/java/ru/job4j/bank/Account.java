package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает банковский счёт клиента. Каждый счёт имеет реквизиты и баланс
 *
 * @author Комаров Иллья
 * @version 1.0
 */

public class Account {
    /**
     * реквизиты счета
     */
    private String requisite;
    /**
     * баланс счета
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвразщает реквизиты счёта
     * @return реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает реквизиты счёта
     * @param requisite реквизиты счёта
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Возвращает баланс счёта
     * @return баланс счёта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанавливает баланс счёта
     * @param balance обновлённый баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнивает счета по реквизитам
     * @param o   объект для сравнения
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Возвращает хеш код счёта по реквизитам
     * @return хеш код
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
