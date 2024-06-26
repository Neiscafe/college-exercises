package com.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader arq = new FileReader("data.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            List<String> linhas = new ArrayList<>();
            while (linha != null) {
                linhas.add(linha);
                linha = lerArq.readLine();
            }
            arq.close();
            double[][] matrizValores = new double[linhas.size()][];
            for (int i = 0; i < linhas.size(); i++) {
                String[] coluna = linhas.get(i).split("\t");
                matrizValores[i] = new double[coluna.length];
                for (int j = 0; j < coluna.length; j++) {
                    try {
                        matrizValores[i][j] = Double.parseDouble(coluna[j]);
                    } catch (NumberFormatException e) {
                        matrizValores[i][j] = 0;
                    }
                }
            }
            mediaLinhas(matrizValores);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void mediaMatriz(double[][] valores) {
        double somaTotal = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                somaTotal += valores[i][j];
            }
        }
        int numeroItens = valores.length * valores[0].length;
        System.out.printf("Matriz total: %.2f", somaTotal/numeroItens);
    }

    public static void mediaColunas(double[][] valores) {
        int numLinhas = valores.length;
        int numColunas = valores[0].length;
        double[] medias = new double[numColunas];

        for (int j = 0; j < numColunas; j++) {
            for (int i = 0; i < numLinhas; i++) {
                medias[j] += valores[i][j];
            }
        }
        for (int i = 0; i < numColunas; i++) {
            System.out.printf("Coluna %d: %.2f\n", i, medias[i] /= numLinhas);
        }

    }

    public static void mediaLinhas(double[][] valores) {
        for (int i = 0; i < valores.length; i++) {
            double somatorioColuna = 0;
            for (int j = 0; j < valores[i].length; j++) {
                somatorioColuna += valores[i][j];
            }
            double mediaColuna = somatorioColuna / valores[i].length;
            System.out.printf("Linha %d : %.2f\n", i + 1, mediaColuna);
        }
    }
}