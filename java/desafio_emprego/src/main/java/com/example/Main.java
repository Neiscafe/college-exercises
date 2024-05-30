package com.example;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        String prompt = "Pai, perdoa-lhes, porque não sabem o que fazem.";
        System.out.println(criptografar(prompt));
    }

    public static String criptografar(String s) throws IllegalArgumentException {
        char[] semEspacos = s.replace(" ", "").toCharArray();
        int tamanho = semEspacos.length;
        int linhas = getLinhas(tamanho);
        int colunas = getColunas(tamanho);
        char[][] array = new char[linhas][colunas];
        int ultima = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (ultima < tamanho) {
                    array[i][j] = semEspacos[ultima];
                    ultima++;
                }
            }
        }
        StringBuilder strb = new StringBuilder();
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                strb.append(array[i][j]);
            }
            strb.append(" ");
        }
        return strb.toString();
    }

    public static int getLinhas(int tamanho) {
        double raiz = Math.sqrt(tamanho);
        return (int) raiz;
    }

    public static int getColunas(int tamanho) {
        double raiz = Math.sqrt(tamanho);
        int raizInteira = (int) raiz;
        if (raiz - raizInteira == 0) {
            return raizInteira;
        } else {
            return raizInteira + 1;
        }
    }
}