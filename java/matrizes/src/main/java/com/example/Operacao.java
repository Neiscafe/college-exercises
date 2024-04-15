package com.example;

import java.lang.StringBuilder;

public class Operacao {
    public static int[][] soma(Matriz matrizA, Matriz matrizB) {
        int[][] a = matrizA.getMatriz();
        int[][] b = matrizB.getMatriz();

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("[soma] As matrizes precisam ter o mesmo tamanho para soma.");
        }

        int m = a.length;
        int n = a[0].length;

        int[][] resultado = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        return resultado;
    }

    public static int[][] multiplica(Matriz matrizA, Matriz matrizB) {
        int[][] a = matrizA.getMatriz();
        int[][] b = matrizB.getMatriz();

        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("[multiplica] As matrizes precisam ter o mesmo tamanho para multiplicação.");
        }

        int m = a.length;
        int n = a[0].length;

        int[][] resultado = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = a[i][j] * b[i][j];
            }
        }

        return resultado;
    }

    public static String printar(Matriz matriz){
        String mensagem = "";
        int[][] matrizParaPrint = matriz.getMatriz();
        mensagem.concat("[\n");
        for(int[] innerArray : matrizParaPrint){
            mensagem.concat("\t[\n");
            for(int p : innerArray){
                mensagem.concat(String.format("\t\t%d\n", p)); 
            }
            mensagem.concat("\t]\n");
        }
        mensagem.concat("]\n");
        return mensagem;
    }

    public static String printar(int[][] matrizParaPrint){
        String mensagem = "";
        StringBuilder builder = new StringBuilder(mensagem);
        builder.append("\n[\n");
        for(int[] innerArray : matrizParaPrint){
            builder.append("\t[\n");
            for(int p : innerArray){
                builder.append(String.format("\t\t%d\n", p)); 
            }
            builder.append("\t]\n");
        }
        builder.append("],\n");
        return builder.toString();
    }
}
