package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /// testes
        /// polimorfismo
        /// override
        Funcionario f1 = new Funcionario("Alex", "123456");
        Funcionario f2 = new FuncionarioBasico("Alex", "123457", "Escola de educação básica Educar-se");
        FuncionarioMedio f3 = new FuncionarioMedio("Alex", "123458", "Escola de educação básica Educar-se",
                "Instituto Federal sul-riograndense de tecnologia e inovação");
        Funcionario f4 = new FuncionarioSuperior("Felipe", "1234569", "Escola de educação básica Educar-se", "Instituto Federal sul-riograndense de tecnologia e inovação", "Universidade de Santa Cruz do Sul");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);

        Relatorio.imprimirRelatorio(funcionarios);
    }
    private static void printarFuncionario(Funcionario f){
        if(f instanceof FuncionarioSuperior){
            System.out.println("\nO próximo tem faculdade");
        }
        System.out.println(f.toString());
    }
}