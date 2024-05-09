package com.example;

public class FuncionarioSuperior extends FuncionarioMedio {
    private String nomeInstituicaoSuperior;

    public FuncionarioSuperior(String nome, String codigoFuncional, String nomeEscola, String nomeInstituicaoMedio,
            String nomeInstituicaoSuperior) {
        super(nome, codigoFuncional, nomeEscola, nomeInstituicaoMedio);
        this.nomeInstituicaoSuperior = nomeInstituicaoSuperior;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\n * Ensino básico: %s", nomeInstituicaoSuperior);
    }

    public String getNomeInstituicaoSuperior() {
        return nomeInstituicaoSuperior;
    }

    public void setNomeInstituicaoSuperior(String nomeInstituicaoSuperior) {
        this.nomeInstituicaoSuperior = nomeInstituicaoSuperior;
    }
}
