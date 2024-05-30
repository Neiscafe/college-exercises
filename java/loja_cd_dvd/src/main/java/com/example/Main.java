package com.example;

public class Main {
    public static void main(String[] args) {
        final Midia cd1 = new Cd(1, 1.1, "asd", 3);
        final Cd cd2 = new Cd(1, 1.1, "asd", 3);
        final Dvd dvd = new Dvd(2, 2.3, "asdasdasd", 9);

        cd1.printarDados();
        cd2.printarDados();
        dvd.printarDados();
    }
}