package org.example;

import java.util.List;

public class Carro {

    private String nome;
    private List<Problema> listProblemas;

    public Carro(String nome) {
        this.nome = nome;
        this.listProblemas = listProblemas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Problema> getListProblemas() {
        return listProblemas;
    }

    public void setListProblemas(List<Problema> listProblemas) {
        this.listProblemas = listProblemas;
    }

    @Override
    public String toString() {
        return nome;
    }
}
