package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book skazki = new Book("Skazki", 100);
        Book cleanCode = new Book("Clean code", 420);
        Book idiot = new Book("Idiot", 640);
        Book warAndPeace = new Book("War and peace", 1500);

        Book[] books = new Book[4];
        books[0] = skazki;
        books[1] = cleanCode;
        books[2] = idiot;
        books[3] = warAndPeace;

        System.out.println("All books");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }

        System.out.println();
        System.out.println("Replace books");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }

        System.out.println();
        System.out.println("Shown only \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
