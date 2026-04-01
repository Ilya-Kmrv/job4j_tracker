package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу с клиентами банка и их счетами.
 * Позволяет добавлять и удалять пользователей, добавлять счета.
 * Реализован поик пользователей и счета по паспорту и реквизитом счёта, а также выполнять переводы между счетами.
 *
 * @author Комаров Илья
 * @version 1.0
 */

public class BankService {

    /**
     * Хранилище клиентов и их счетов, где клиент-ключ, счёт-значение
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление нового клиента в хранилище
     * @param user клиент, которого мы добавляем
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаление клиента из хранилища с поиском клиента по паспорту
     * @param passport паспорт клиента
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Добавление счёта клиента
     * @param passport паспорт клиента
     * @param account счёт
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Поиск клиента по паспорту
     * @param passport паспорт клиента
     * @return возвращает пользователя или null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Поиск счёта по реквизитам
     *
     * @param passport паспорт клиента
     * @param requisite реквизиты счёта
     * @return возвращает счёт или null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Перевод денег между счетами
     * @param sourcePassport паспорт отправителя
     * @param sourceRequisite реквизиты отправителя
     * @param destinationPassport паспорт получателя
     * @param destinationRequisite реквизиты получателя
     * @param amount сумма перевода
     * @return при успешном переводе-true, иначе false
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite, String destinationPassport, String
            destinationRequisite, double amount) {
        boolean result = false;
        Account source = findByRequisite(sourcePassport, sourceRequisite);
        Account destination = findByRequisite(destinationPassport, destinationRequisite);
        if (source != null && destination != null && source.getBalance() >= amount) {
            source.setBalance(source.getBalance() - amount);
            destination.setBalance(destination.getBalance() + amount);
            result = true;
        }
        return result;
    }

    /**
     * Возвращает список счетов клиента
     * @param user клиент
     * @return список счетов клиента
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
