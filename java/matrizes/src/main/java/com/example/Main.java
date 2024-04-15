package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] matrizEx1 = {{1,2,3,4,5}, {2,3,4,5,6,}, {3,4,5,6,7,}, {4,5,6,7,8,}};
        int[][] matrizEx2 = {{1,2,3,4}, {2,3,4,5,}, {3,4,5,6,}, {4,5,6,7,}};
        int[][] matrizEx3 = {{1,2,3,4,5}, {2,3,4,5,6,}, {3,4,5,6,7,}};
        int[][] matrizEx4 = {{5,4,3,2,1,}, {6,5,4,3,2,}, {7,6,5,4,3}, {8,7,6,5,4,}};
        Matriz m1 = new Matriz(matrizEx1);
        Matriz m2 = new Matriz(matrizEx2);
        Matriz m3 = new Matriz(matrizEx3);
        Matriz m4 = new Matriz(matrizEx4);
        ArrayList<Matriz> matrizesParaComparacao = new ArrayList<>();
        matrizesParaComparacao.add(m1);
        matrizesParaComparacao.add(m2);
        matrizesParaComparacao.add(m3);
        matrizesParaComparacao.add(m4);

        matrizesParaComparacao.forEach(m ->{
            try {
                int[][] resOperacao = Operacao.soma(matrizesParaComparacao.get(0), m);
                System.out.println("\n" + Operacao.printar(resOperacao));   
            } catch (Exception e) {
                System.out.println(String.format("\n" + "Ocorreu uma exceção! Mensagem: %s", e.getMessage()));
            }
            try {
                int[][] resOperacao = Operacao.multiplica(matrizesParaComparacao.get(0), m);
                System.out.println("\n" + Operacao.printar(resOperacao));   
            } catch (Exception e) {
                System.out.println(String.format("\n" + "Ocorreu uma exceção! Mensagem: %s\n", e.getMessage()));
            }
        } );
    }
}