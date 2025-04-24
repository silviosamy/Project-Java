package org.example;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    public List<Pais> criaPaise(List<String> listPaisesStr) {
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
