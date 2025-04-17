package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainTesteV2 {
    public static void main(String[] args) {
        UtilClass utilClass = new UtilClass();
        List<String> listContinentes = new ArrayList<>();

        listContinentes.add("América do Sul");
        listContinentes.add("Europa");
        listContinentes.add("Ásia");
        List<Continente> listCont = utilClass.listaContinentes(listContinentes);

        for (Continente continente : listCont) {
            if (continente.getNome().equalsIgnoreCase("América do Sul")) {
                List<String> paises = new ArrayList<>();
                paises.add("Brasil");
                paises.add("Argentina");
                criaPais(continente, paises);
            } else if (continente.getNome().equalsIgnoreCase("Europa")) {
                List<String> paisesE = new ArrayList<>();
                paisesE.add("Inglaterra");
                criaPais(continente, paisesE);
            } else if (continente.getNome().equalsIgnoreCase("Ásia")) {
                List<String> paisesA = new ArrayList<>();
                paisesA.add("China");
                criaPais(continente, paisesA);
            }
        }
        for (Continente continente : listCont) {
            System.out.println("\nContinente:" + continente.getNome());
            for (Pais pais : continente.getListPais()) {
                System.out.println("País:" + pais.getNome());
            }
        }
    }

    static public void criaPais(Continente continente, List<String> listPaises) {
        List<Pais> listPais = new ArrayList<>();
        for (String nome : listPaises) {
            Pais pais = new Pais(nome);
            listPais.add(pais);
        }
        continente.setListPais(listPais);
    }

    static public void criaEstado(Pais pais, List<String> listEstados) {
        List<Estado> listEstado = new ArrayList<>();
        for (String nome : listEstados) {
            Estado estado = new Estado(nome);
            listEstado.add(estado);
        }
        pais.setListEstados(listEstado);
    }

    static public void criaCidade(Estado estado, List<String> listCidades) {
        List<Cidade> listCidade = new ArrayList<>();
        for (String nome : listCidades) {
            Cidade cidade = new Cidade(nome);
            listCidade.add(cidade);
        }
        estado.setListCidades(listCidade);
    }
}
