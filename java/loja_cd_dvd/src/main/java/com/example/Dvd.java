package com.example;

public class Dvd extends Midia {
    private int nFaixas;

    public Dvd() {
        super();
    }

    public Dvd(int c, double p, String s, int f) {
        super(c, p, s);
        this.nFaixas = f;
    }

    @Override
    public String getDetalhes() {
        return String.format("Código: %d\nPreço: %.2f\nNome: %s\nFaixas: %d", super.getCodigo(), super.getPreco(),
                super.getNome(), this.nFaixas);
    }

    @Override
    public void inserirDados() {

    }

}
