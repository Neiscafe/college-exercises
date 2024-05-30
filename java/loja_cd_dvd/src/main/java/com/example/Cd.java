package com.example;

public class Cd extends Midia {
    private int nMusicas;

    public Cd() {
        super();
    }

    public Cd(int c, double p, String s, int m) {
        super(c, p, s);
        this.nMusicas = m;
    }

    @Override
    public String getDetalhes() {
        return String.format("Código: %d\nPreço: %.2f\nNome: %s\nMúsicas: %d", super.getCodigo(), super.getPreco(),
                super.getNome(), this.nMusicas);
    }

    @Override
    public void inserirDados() {

    }

}
