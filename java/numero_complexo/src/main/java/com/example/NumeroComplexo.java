package com.example;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    NumeroComplexo inicializaNumero(double arg0, double arg1) {
        this.real = arg0;
        this.imaginario = arg1;
        return this;
    }

    public String imprimeNumero() {
        if (real == 0.0 || imaginario == 0.0) {
            throw new IllegalArgumentException(
                    "[imprimeNumero] Os componentes do número complexo devem ser inicializados!");
        }
        return String.format("%.2f + %.2f\\i", real, imaginario);
    }

    public boolean ehIgual(NumeroComplexo arg0) {
        return equals(arg0);
    }

    public NumeroComplexo soma(NumeroComplexo arg0) {
        NumeroComplexo res = new NumeroComplexo();
        res.inicializaNumero(this.real + arg0.real, this.imaginario + arg0.imaginario);
        return res;
    }

    public NumeroComplexo subtrai(NumeroComplexo arg0) {
        NumeroComplexo res = new NumeroComplexo();
        res.inicializaNumero(this.real - arg0.real, this.imaginario - arg0.imaginario);
        return res;
    }

    public NumeroComplexo multiplica(NumeroComplexo arg0) {
        double ac = this.real * arg0.real;
        double bd = this.imaginario * arg0.imaginario;
        double ad = this.real * arg0.imaginario;
        double bc = this.imaginario * arg0.real;
        return new NumeroComplexo().inicializaNumero(ac - bd, ad + bc);
    }
    
    public NumeroComplexo divide(NumeroComplexo arg0) {
        double ac = this.real * arg0.real;
        double bd = this.imaginario * arg0.imaginario;
        double ad = this.real * arg0.imaginario;
        double bc = this.imaginario * arg0.real;
        return new NumeroComplexo().inicializaNumero(ac + bd, ad + bc);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imaginario);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NumeroComplexo other = (NumeroComplexo) obj;
        if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
            return false;
        if (Double.doubleToLongBits(imaginario) != Double.doubleToLongBits(other.imaginario))
            return false;
        return true;
    }
}
