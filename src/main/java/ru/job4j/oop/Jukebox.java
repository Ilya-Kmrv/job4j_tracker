package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            case 3:
                System.out.println("Песня не найдена");
                break;
            default:
                System.out.println("Неизвестная позиция");
    }
}

public static void main(String[] args) {
    Jukebox tracks = new Jukebox();
    tracks.music(1);
    tracks.music(2);
    tracks.music(3);
}
}