package org.example;

import java.util.List;

public class Continente {

    private String nome;
    private List<Pais> listPais;
    private List<Continente> listContinente;

    public List<Continente> getListContinente() {
        return listContinente;
    }

    public void setListContinente(List<Continente> listContinente) {
        this.listContinente = listContinente;
    }

    public Continente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getListPais() {
        return listPais;
    }

    public void setListPais(List<Pais> listPais) {
        this.listPais = listPais;
    }
}
