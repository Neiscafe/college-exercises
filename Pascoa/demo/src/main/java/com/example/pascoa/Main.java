package com.example.pascoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LocalDate data = calcularDataPascoa(LocalDate.now().getYear());
        System.out.println(String.format("A páscoa do ano %d cai no dia %s", data.getYear(),
                data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }

    public static LocalDate calcularDataPascoa(int ano) {
        int a = ano % 19;
        int b = ano / 100;
        int c = ano % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + l - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;

        return LocalDate.of(ano, month, day);
    }
}