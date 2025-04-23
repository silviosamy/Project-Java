package org.example;

import java.util.List;

public class Cidade {
    private String nome;
    List<Bairro> listBairros;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Bairro> getListBairros() {
        return listBairros;
    }

    public void setListBairros(List<Bairro> listBairros) {
        this.listBairros = listBairros;
    }
}
