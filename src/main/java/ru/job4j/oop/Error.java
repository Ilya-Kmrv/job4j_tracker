package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
    Error err = new Error(true, 420, "всё ок");
    err.printInfo();
    Error err2 = new Error(false, 404, "Страница не найдена");
    err2.printInfo();
    Error def = new Error();
    def.printInfo();
}

    public void printInfo() {
    System.out.println("Ошибка: " + active);
    System.out.println("Код: " + status);
    System.out.println("Подробнее: " + message);
    }
}
