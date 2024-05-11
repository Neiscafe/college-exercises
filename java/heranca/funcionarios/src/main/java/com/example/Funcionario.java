package com.example;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected Double renda = 1000.0;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    @Override
    public String toString() {
       String retorno = String.format("\nFuncionário %s: \n * Nome: %s\n * Salário: R$%.2f", codigoFuncional, nome, renda);
       return retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }
    
    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
}
