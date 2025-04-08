package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        List<Continente> listContinentes = new ArrayList<>();
        List<Continente> listContinentes1 = new ArrayList<>();
        List<Continente> listContinentes2 = new ArrayList<>();
        List<Continente> listContinentes3 = new ArrayList<>();
        List<Pais> listPais1 = new ArrayList<>();
        List<Pais> listPais2 = new ArrayList<>();
        List<Pais> listPais3 = new ArrayList<>();
        List<Estado> listEstados = new ArrayList<>();
        List<Cidade> listCidades = new ArrayList<>();
        List<Bairro> listBairros = new ArrayList<>();

        Continente continente1 = new Continente("America do Sul");
        Continente continente2 = new Continente("Europa");
        Continente continente3 = new Continente("Ásia");

        listContinentes1.add(continente1);
        listContinentes2.add(continente2);
        listContinentes3.add(continente3);
        continente1.setListContinente(listContinentes1);
        continente2.setListContinente(listContinentes2);
        continente3.setListContinente(listContinentes3);

        Pais pais1 = new Pais("Brasil");
        Pais pais2 = new Pais("Inglaterra");
        Pais pais3 = new Pais("China");

        listPais1.add(pais1);
        listPais2.add(pais2);
        listPais3.add(pais3);

        for (Continente continente : listContinentes) {
            System.out.println(continente.getNome());
        }


    }
}
