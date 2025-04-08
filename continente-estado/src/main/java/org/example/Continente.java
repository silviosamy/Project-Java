package org.example;

import java.util.ArrayList;
import java.util.List;

public class Continente {

    private String nome;
    List<Pais> listPais;

    public Continente(String nome) {
        this.nome = nome;
        this.listPais = new ArrayList<>();
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
