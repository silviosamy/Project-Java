package org.example;

import org.intellij.lang.annotations.JdkConstants;

import java.util.ArrayList;
import java.util.List;

public class MainTesteV3 {
    public static void main(String[] args) {

        List<Continente> listContinentes = new ArrayList<>();
        Continente continente1 = new Continente("América do Sul");
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
            } else if (continente.getNome().equalsIgnoreCase("Ásia")) {
                List<Pais> listPais = new ArrayList<>();
                listPais.add(new Pais("China"));
                continente.setListPais(listPais);
            }
        }

        for (Continente continente : listContinentes) {
            for (Pais pais : continente.getListPais()) {
                if (pais.getNome().equalsIgnoreCase("Brasil")) {
                    List<Estado> listEstados = new ArrayList<>();
                    listEstados.add(new Estado("Santa Catarina"));
                    listEstados.add(new Estado("São Paulo"));
                } else if (pais.getNome().equalsIgnoreCase("Argentina")) {
                    List<Estado> listEstados = new ArrayList<>();
                    listEstados.add(new Estado("Buenos Aires"));
                } else if (pais.getNome().equalsIgnoreCase(""))

            }
        }


        for (Continente continente : listContinentes) {
            System.out.println("Continente: " + continente.getNome() + "\nPaíses: ");
            for (Pais pais : continente.getListPais()) {
                System.out.println(pais.getNome());
            }
        }
    }

}
