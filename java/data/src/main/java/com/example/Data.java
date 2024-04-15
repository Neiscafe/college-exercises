package com.example;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean vemAntes(Data outraData) {
        if (ano < outraData.ano) {
            return true;
        } else if (ano > outraData.ano) {
            return false;
        } else if (mes < outraData.mes) {
            return true;
        } else if (mes > outraData.mes) {
            return false;
        } else if (dia < outraData.dia) {
            return true;
        } else if (dia > outraData.dia) {
            return false;
        } else {
            return true;
        }
    }
}
