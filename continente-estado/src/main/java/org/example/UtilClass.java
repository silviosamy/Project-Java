package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilClass {

    public void adicionaPaisesNoContinente(List<Continente> listContinentes) {
        for (Continente continente : listContinentes) {
            if (continente.getNome().equalsIgnoreCase("América do Sul")) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Brasil", "Argentina"));
                continente.setListPais(criaPais(listPaises));
            } else if (continente.getNome().equalsIgnoreCase("Europa")) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Inglaterra"));
                continente.setListPais(criaPais(listPaises));
            } else if (continente.getNome().equalsIgnoreCase(("Ásia"))) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Japao"));
                continente.setListPais(criaPais(listPaises));
            }
        }

    }

    public void adicionaEstadosNoPais(List<Pais> listPaises, String nome) {
        if (listPaises != null) {
            for (Pais pais : listPaises) {
                if (pais.getNome().equalsIgnoreCase("Brasil")) {
                    List<String> listEstados = new ArrayList<>(Arrays.asList("Santa Catarina"));
                    pais.setListEstados(criaEstado(listEstados));
                } else if (pais.getNome().equalsIgnoreCase("Inglaterra")) {
                    List<String> listEstados = new ArrayList<>(Arrays.asList("Londres"));
                    pais.setListEstados(criaEstado(listEstados));
                } else if (pais.getNome().equalsIgnoreCase("Japao")) {
                    List<String> listEstados = new ArrayList<>(Arrays.asList("Toquio"));
                    pais.setListEstados(criaEstado(listEstados));
                }
            }
        } else {
            System.out.println("Este Continente não tem países" + nome);
        }

    }


    public List<Pais> criaPais(List<String> listPaisesStr) {
        List<Pais> listPais = new ArrayList<>();
        for (String pais : listPaisesStr) {
            listPais.add(new Pais(pais));
        }
        return listPais;
    }

    public List<Estado> criaEstado(List<String> listEstadoStr) {
        List<Estado> listEstados = new ArrayList<>();
        for (String estado : listEstadoStr) {
            listEstados.add(new Estado(estado));
        }
        return listEstados;
    }

    public List<Cidade> criaCidade(List<String> listCidadeStr) {
        List<Cidade> listCidades = new ArrayList<>();
        for (String cidade : listCidadeStr) {
            listCidades.add(new Cidade(cidade));
        }
        return listCidades;
    }

    public List<Bairro> criaBairro(List<String> listBairroStr) {
        List<Bairro> listBairros = new ArrayList<>();
        for (String bairro : listBairroStr) {
            listBairros.add(new Bairro(bairro));
        }
        return listBairros;
    }

    public List<Continente> listaContinentes(List<String> nomeContinentes) {
        List<Continente> listContinentes = new ArrayList<>();
        for (String nome : nomeContinentes) {
            Continente continente = new Continente(nome);
            listContinentes.add(continente);
        }
        return listContinentes;

    }


}
