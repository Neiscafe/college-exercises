package com.example;

public class Funcionario {
    private String nome;
    private String codigoFuncional;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    @Override
    public String toString() {
       String retorno = String.format("\nFuncionário\n * Nome: %s\n * Código: %s", nome, codigoFuncional);
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
}
