package com.example;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(15, 4, 2024);
        Data data2 = new Data(15, 4, 2024);
        
        System.out.println(data1.vemAntes(data2));
    }
}