package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainTesteV3 {
    public static void main(String[] args) {

        List<Continente> listContinentes = new ArrayList<>();
        Continente continente1 = new Continente("América");
        Continente continente2 = new Continente("Europa");
        Continente continente3 = new Continente("Ásia");
        listContinentes.add(continente1);
        listContinentes.add(continente2);
        listContinentes.add(continente3);

        for (Continente continente : listContinentes) {
            if (continente.getNome().equalsIgnoreCase("América do Sul")) {
                List<Pais> listPais = new ArrayList<>();
                listPais.add(new Pais("Brasil"));
                listPais.add(new Pais("Argentina"));
                continente.setListPais(listPais);
            } else if (continente.getNome().equalsIgnoreCase("Europa")) {
                List<Pais> listPais = new ArrayList<>();
                listPais.add(new Pais("Inglaterra"));
                continente.setListPais(listPais);
            } else if (continente.getNome().equalsIgnoreCase("África")) {
                List<Pais> listPais = new ArrayList<>();
                listPais.add(new Pais("África do Sul"));
                continente.setListPais(listPais);
            }
        }

        for (Continente continente : listContinentes) {
            System.out.println(continente.getNome());
            for (Pais pais : continente.getListPais()) {
                System.out.println(pais.getNome());
            }
        }
    }

}
