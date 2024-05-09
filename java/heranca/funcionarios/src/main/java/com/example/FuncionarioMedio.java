package com.example;

public class FuncionarioMedio extends FuncionarioBasico {
    private String nomeInstituicaoMedio;

    public FuncionarioMedio(String nome, String codigoFuncional, String nomeEscola, String nomeInstituicaoMedio) {
        super(nome, codigoFuncional, nomeEscola);
        this.nomeInstituicaoMedio = nomeInstituicaoMedio;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "\n * Ensino médio: %s", nomeInstituicaoMedio);
    }

    public String getNomeInstituicaoMedio() {
        return nomeInstituicaoMedio;
    }

    public void setNomeInstituicaoMedio(String nomeInstituicaoMedio) {
        this.nomeInstituicaoMedio = nomeInstituicaoMedio;
    }
}
