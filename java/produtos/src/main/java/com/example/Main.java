package com.example;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99, 10);
        Produto produto2 = new Produto("Calça Jeans", 59.99, 5);

        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.adicionarItem(produto1, 2);
        notaFiscal.adicionarItem(produto2, 1);
        notaFiscal.gerarRelatorio();
    }
}