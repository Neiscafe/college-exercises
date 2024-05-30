package com.example;

public abstract class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
    }
    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
    public String getTipo(){
        return getClass().getSimpleName();
    }
    public abstract String getDetalhes();
    public void printarDados(){
        System.err.println(getTipo()+"\n"+getDetalhes());
    }
    public abstract void inserirDados();
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    

    
}
