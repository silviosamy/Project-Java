package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        UtilClass utilClass = new UtilClass();
        List<Continente> listContinentes = new ArrayList<>();

        Continente continenteSulAmerica = new Continente("América do Sul");
        Continente continenteEuropa = new Continente("Europa");
        Continente continenteAsia = new Continente("Ásia");

        List<Pais> paisesSulAmerica = new ArrayList<>();
        List<Pais> paisesEuropa = new ArrayList<>();
        List<Pais> paisesAsia = new ArrayList<>();

        Pais brasil = new Pais("Brasil");
        Pais inglaterra = new Pais("Inglaterra");
        Pais china = new Pais("China");
        paisesSulAmerica.add(brasil);
        paisesEuropa.add(inglaterra);
        paisesAsia.add(china);

        continenteSulAmerica.setListPais(paisesSulAmerica);
        continenteEuropa.setListPais(paisesEuropa);
        continenteAsia.setListPais(paisesAsia);
        listContinentes.add(continenteSulAmerica);
        listContinentes.add(continenteEuropa);
        listContinentes.add(continenteAsia);

        List<Estado> listEstadosBrasil = new ArrayList<>();
        List<Estado> listEstadosInglaterra = new ArrayList<>();
        List<Estado> listEstadosChina = new ArrayList<>();

        Estado santaCatarina = new Estado("Santa Catarina");
        Estado saoPaulo = new Estado("São Paulo");
        Estado manchester = new Estado("Manchester");
        Estado huangpu = new Estado("Huangpu");

        listEstadosBrasil.add(santaCatarina);
        listEstadosBrasil.add(saoPaulo);
        listEstadosInglaterra.add(manchester);
        listEstadosChina.add(huangpu);

        brasil.setListEstados(listEstadosBrasil);
        inglaterra.setListEstados(listEstadosInglaterra);
        china.setListEstados(listEstadosChina);


        List<Cidade> cidadesSC = new ArrayList<>();
        List<Cidade> cidadesSP = new ArrayList<>();
        List<Cidade> cidadesMC = new ArrayList<>();
        List<Cidade> cidadesHU = new ArrayList<>();
        List<Cidade> listCidades = new ArrayList<>();

        cidadesSC.add(new Cidade("Joinville"));
        cidadesSC.add(new Cidade("Jaraguá do Sul"));
        cidadesSP.add(new Cidade("São Paulo"));
        cidadesSP.add(new Cidade("Ribeirão Preto"));
        cidadesMC.add(new Cidade("Manchester"));
        cidadesHU.add(new Cidade("Xangai"));

        listCidades.addAll(cidadesSC);
        listCidades.addAll(cidadesSP);
        listCidades.addAll(cidadesMC);
        listCidades.addAll(cidadesHU);

        santaCatarina.setListCidades(cidadesSC);
        saoPaulo.setListCidades(cidadesSP);
        manchester.setListCidades(cidadesMC);
        huangpu.setListCidades(cidadesHU);

        for (Continente continente : listContinentes) {
            System.out.println("\nContinente:\n" + continente.getNome());
            for (Pais pais : continente.getListPais()) {
                System.out.println("País:" + pais.getNome());
                for (Estado estado : pais.getListEstados()) {
                    System.out.println("\nEstado:" + estado.getNome());
                    for (Cidade cidade : estado.getListCidades()) {
                        System.out.println("Cidade: " + cidade.getNome());
                    }
                }
            }
        }
    }
}
