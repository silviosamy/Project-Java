package org.example;

import java.util.List;

public class Pessoa {

    private String name;
    private List<Carro> listCarros;

    public Pessoa(String name) {
        this.name = name;
        this.listCarros = listCarros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Carro> getListCarros() {
        return listCarros;
    }

    public void setListCarros(List<Carro> listCarros) {
        this.listCarros = listCarros;
    }
}
