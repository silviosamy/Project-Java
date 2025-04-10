package org.example;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    public Continente criarContinente(String nome) {
        Continente continente1 = new Continente(nome);
        return continente1;
    }

    public List<Continente> criarContinentes(List<String> nomeContinentes) {
        List<Continente> listContinentes = new ArrayList<>();
        for (String nome : nomeContinentes) {
            Continente continente = new Continente(nome);
            listContinentes.add(continente);
        }
        return listContinentes;

    }

}
