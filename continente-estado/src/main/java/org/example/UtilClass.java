package org.example;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    public Continente criarContinentes(String nome) {
        Continente continente1 = new Continente(nome);
        return continente1;
    }

    public List<Continente> listaContinentes(List<String> nomeContinentes) {
        List<Continente> listContinentes = new ArrayList<>();
        for (String nome : nomeContinentes) {
            Continente continente = new Continente(nome);
            listContinentes.add(continente);
        }
        return listContinentes;

    }

    public List<Pais> listaPaises(List<String> nomePaises) {
        List<Pais> listPais = new ArrayList<>();
        for (String nome : nomePaises) {
            Pais pais = new Pais(nome);
            listPais.add(pais);
        }
        return listPais;
    }

}
