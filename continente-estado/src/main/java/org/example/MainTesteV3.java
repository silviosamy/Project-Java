package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTesteV3 {
    public static void main(String[] args) {

        //Cria os objetos e lista principal para iteração
        UtilClass utilClass = new UtilClass();
        List<Continente> listContinentes = new ArrayList<>();
        Continente continente1 = new Continente("America do Sul");
        Continente continente2 = new Continente("Europa");
        Continente continente3 = new Continente("Asia");
        listContinentes.add(continente1);
        listContinentes.add(continente2);
        listContinentes.add(continente3);

        //Cria o(s) Pais(es) dentro de cada Continente
        for (Continente continente : listContinentes) {
            if (continente.getNome().trim().equalsIgnoreCase("America do Sul")) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Brasil"));
                continente.setListPais(utilClass.criaPais(listPaises));
            } else if (continente.getNome().trim().equalsIgnoreCase("Europa")) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Inglaterra"));
                continente.setListPais(utilClass.criaPais(listPaises));
            } else if (continente.getNome().trim().equalsIgnoreCase(("Asia"))) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Japao"));
                continente.setListPais(utilClass.criaPais(listPaises));
            }
        }
        //Cria Estado(s) dentro de cada Pais
        for (Continente continente : listContinentes) {
            if (continente.getListPais() == null)
                continue;
            for (Pais pais : continente.getListPais()) {
                if (pais.getNome().trim().equalsIgnoreCase("Brasil")) {
                    List<String> listEstados = new ArrayList<>(Arrays.asList("Santa Catarina"));
                    pais.setListEstados(utilClass.criaEstado(listEstados));
                } else if (pais.getNome().trim().equalsIgnoreCase("Inglaterra")) {
                    List<String> listEstados = new ArrayList<>(Arrays.asList("Londres"));
                    pais.setListEstados(utilClass.criaEstado(listEstados));
                } else if (pais.getNome().trim().equalsIgnoreCase("Japao")) {
                    List<String> listEstados = new ArrayList<>(Arrays.asList("Toquio"));
                    pais.setListEstados(utilClass.criaEstado(listEstados));
                }

            }
        }
        //Cria Cidade(s) dentro de cada Estado
        for (Continente continente : listContinentes) {
            if (continente.getListPais() == null)
                continue;
            for (Pais pais : continente.getListPais()) {
                if (pais.getListEstados() == null)
                    continue;
                for (Estado estado : pais.getListEstados()) {
                    if (estado.getNome().trim().equalsIgnoreCase("Santa Catarina")) {
                        List<String> listCidades = new ArrayList<>(Arrays.asList("Joinville"));
                        estado.setListCidades(utilClass.criaCidade(listCidades));
                    } else if (estado.getNome().trim().equalsIgnoreCase("Londres")) {
                        List<String> listCidades = new ArrayList<>(Arrays.asList("Cidade de Londres"));
                        estado.setListCidades(utilClass.criaCidade(listCidades));
                    } else if (estado.getNome().trim().equalsIgnoreCase("Toquio")) {
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
                        if (cidade.getListBairros() == null)
                            continue;
                        if (cidade.getNome().trim().equalsIgnoreCase("Joinville")) {
                            List<String> listBairros = new ArrayList<>(Arrays.asList("America"));
                            cidade.setListBairros(utilClass.criaBairro(listBairros));
                        } else if (cidade.getNome().trim().equalsIgnoreCase("Cidade de Londres")) {
                            List<String> listBairros = new ArrayList<>(Arrays.asList("Manchester"));
                            cidade.setListBairros(utilClass.criaBairro(listBairros));
                        } else if (cidade.getNome().trim().equalsIgnoreCase("Cidade de Toquio")) {
                            List<String> listBairros = new ArrayList<>(Arrays.asList("Suzuka"));
                            cidade.setListBairros(utilClass.criaBairro(listBairros));
                        }
                    }
                }
            }
        }

        //Iteração nas listas dentro das listas para printar na tela.
        for (Continente continente : listContinentes) {
            System.out.println("\nContinente: " + continente.getNome() + "\nPaíses: ");
            if (continente.getListPais() == null )
                continue;
            for (Pais pais : continente.getListPais()) {
                System.out.println(pais.getNome() + "\nEstados:");
                if (pais.getListEstados() == null)
                    continue;
                for (Estado estado : pais.getListEstados()) {
                    System.out.println(estado.getNome() + "\nCidades: ");
                    if (estado.getListCidades() == null)
                        continue;
                    for (Cidade cidade : estado.getListCidades()) {
                        System.out.println(cidade.getNome() + "\nBairros:");
                        if (cidade.getListBairros() == null)
                            continue;
                        for (Bairro bairro : cidade.getListBairros()) {
                            System.out.println(bairro.getNome());
                        }
                    }
                }
            }
        }
    }
}
