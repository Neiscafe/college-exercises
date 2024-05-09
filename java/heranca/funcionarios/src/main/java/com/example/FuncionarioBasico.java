package com.example;

public class FuncionarioBasico extends Funcionario {
    private String nomeInstituicaoBasico;

    public FuncionarioBasico(String nome, String codigoFuncional, String nomeEscola) {
        super(nome, codigoFuncional);
        renda = renda * 1.1;
        this.nomeInstituicaoBasico = nomeEscola;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\n * Ensino básico: %s", nomeInstituicaoBasico);
    }

    public String getNomeInstituicaoBasico() {
        return nomeInstituicaoBasico;
    }

    public void setNomeInstituicaoBasico(String nomeEscola) {
        this.nomeInstituicaoBasico = nomeEscola;
    }

}
