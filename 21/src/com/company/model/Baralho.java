package com.company.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta>cartas = new ArrayList<>();

    public Baralho(){
        montar();
    }

    private void montar() {

        for (Naipe naipe : Naipe.values()){
            int aux = 1;
            for(Valor valor : Valor.values()){
                Carta carta = new Carta();
                carta.setValor(valor);
                carta.setNaipe(naipe);
                carta.setValor_n(aux);
                aux = aux + 1;
                cartas.add(carta);
            }
        }
        Collections.shuffle(cartas);
    }

    public List<Carta> exibir(){
        return cartas;
    }
}
