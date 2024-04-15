package com.exenum;

public enum MesesDoAno {
    JANEIRO(1), FEVERREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9), OUTUBRO(10),
    NOVEMBRO(11), DEZEMBRO(12);
    private int numero;

    MesesDoAno(int numero) {
        if(numero>12 || numero<1){
            throw new IllegalArgumentException("O numero precisa estar estar entre 1 e 12 (ambos inclusivos)");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
