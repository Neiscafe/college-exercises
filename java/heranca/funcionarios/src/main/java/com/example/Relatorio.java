package com.example;

import java.util.List;

public class Relatorio {
    public static void imprimirRelatorio(List<Funcionario> f) {
        StringBuilder strb = new StringBuilder();
        strb.append("Relatório de funcionários:\n\nInício ---->\n");
        f.forEach(arg -> strb.append(arg+"\n"));
        strb.append("\n\n <---- Fim");
        System.out.println(strb.toString());
    }
}
