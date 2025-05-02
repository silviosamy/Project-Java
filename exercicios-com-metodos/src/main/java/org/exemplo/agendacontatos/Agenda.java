package org.exemplo.agendacontatos;

import java.util.List;

public class Agenda {

    private String nome;
    List<Contato> listContatos;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getListContatos() {
        return listContatos;
    }

    public void setListContatos(List<Contato> listContatos) {
        this.listContatos = listContatos;
    }
}
