package com.company.model;

public class Carta {
    private Naipe naipe;
    private Valor valor;
    private int valor_n;

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public int getValor_n() {
        return valor_n;
    }

    public void setValor_n(int valor_n) {
        this.valor_n = valor_n;
    }

    @Override
    public String toString() {
        return "Carta[" + valor + " de " + naipe + "]";
    }


}