package org.example;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    public List<Pais> criaPaises(List<String> listPaisesStr) {
        List<Pais> listPais = new ArrayList<>();
        for (String pais : listPaisesStr) {
            listPais.add(new Pais(pais));
        }
        return listPais;
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
