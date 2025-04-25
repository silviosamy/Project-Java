package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTesteV3 {
    public static void main(String[] args) {

        //Cria os objetos e lista principal para iteração
        UtilClass utilClass = new UtilClass();
        List<Continente> listContinentes = new ArrayList<>();
        listContinentes.add(new Continente("América do Sul"));
        listContinentes.add(new Continente("Europa"));
        listContinentes.add(new Continente("Ásia"));
        listContinentes.add(new Continente("Oceania"));

        //Cria o(s) Pais(es) dentro de cada Continente
        //utilClass.adicionaPaisesNoContinente(listContinentes);

        //Cria Estado(s) dentro de cada Pais
        for (Continente continente : listContinentes) {
            utilClass.adicionaEstadosNoPais(continente.getListPais(), continente.getNome());
        }
        //Cria Cidade(s) dentro de cada Estado
        for (Continente continente : listContinentes) {
            if (continente.getListPais() == null)
                continue;
            for (Pais pais : continente.getListPais()) {
                if (pais.getListEstados() == null)
                    continue;
                for (Estado estado : pais.getListEstados()) {
                    if (estado.getNome().equalsIgnoreCase("Santa Catarina")) {
                        List<String> listCidades = new ArrayList<>(Arrays.asList("Joinville", "Jaragua do Sul"));
                        estado.setListCidades(utilClass.criaCidade(listCidades));
                    } else if (estado.getNome().equalsIgnoreCase("Londres")) {
                        List<String> listCidades = new ArrayList<>(Arrays.asList("Cidade de Londres"));
                        estado.setListCidades(utilClass.criaCidade(listCidades));
                    } else if (estado.getNome().equalsIgnoreCase("Toquio")) {
                        List<String> listCidades = new ArrayList<>(Arrays.asList("Cidade de Toquio"));
                        estado.setListCidades(utilClass.criaCidade(listCidades));

                    }
                }
            }
        }
        //Cria Bairro(s) dentro de cada Cidade
        for (Continente continente : listContinentes) {
            if (continente.getListPais() == null)
                continue;
            for (Pais pais : continente.getListPais()) {
                if (pais.getListEstados() == null)
                    continue;
                for (Estado estado : pais.getListEstados()) {
                    if (estado.getListCidades() == null)
                        continue;
                    for (Cidade cidade : estado.getListCidades()) {
                        if (estado.getListCidades() == null)
                            continue;
                        if (cidade.getNome().equalsIgnoreCase("Joinville")) {
                            List<String> listBairros = new ArrayList<>(Arrays.asList("America"));
                            cidade.setListBairros(utilClass.criaBairro(listBairros));
                        } else if (cidade.getNome().equalsIgnoreCase("Cidade de Londres")) {
                            List<String> listBairros = new ArrayList<>(Arrays.asList("Manchester"));
                            cidade.setListBairros(utilClass.criaBairro(listBairros));
                        } else if (cidade.getNome().equalsIgnoreCase("Cidade de Toquio")) {
                            List<String> listBairros = new ArrayList<>(Arrays.asList("Suzuka"));
                            cidade.setListBairros(utilClass.criaBairro(listBairros));
                        }
                    }
                }
            }
        }

        //Iteração nas listas dentro das listas para printar na tela.
        for (Continente continente : listContinentes) {
            System.out.println("\nContinente: " + continente.getNome());
            if (continente.getListPais() == null)
                continue;
            for (Pais pais : continente.getListPais()) {
                System.out.println("País:" + pais.getNome());
                if (pais.getListEstados() == null)
                    continue;
                for (Estado estado : pais.getListEstados()) {
                    System.out.println("Estado: " + estado.getNome());
                    if (estado.getListCidades() == null)
                        continue;
                    for (Cidade cidade : estado.getListCidades()) {
                        System.out.println("Cidade: " + cidade.getNome());
                        if (cidade.getListBairros() == null)
                            continue;
                        for (Bairro bairro : cidade.getListBairros()) {
                            System.out.println("Bairro: " + bairro.getNome());
                        }
                    }

                }
            }
        }
    }
}
