package org.main;

import java.util.List;

public class Computador {

    private String nome;
    List<Teclado> listTeclados;
    List<Processador> listProcessador;
    List<Mouse> listMouse;

    public List<Mouse> getListMouse() {
        return listMouse;
    }

    public void setListMouse(List<Mouse> listMouse) {
        this.listMouse = listMouse;
    }

    public Computador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Teclado> getListTeclados() {
        return listTeclados;
    }

    public void setListTeclados(List<Teclado> listTeclados) {
        this.listTeclados = listTeclados;
    }

    public List<Processador> getListProcessador() {
        return listProcessador;
    }

    public void setListProcessador(List<Processador> listProcessador) {
        this.listProcessador = listProcessador;
    }
}
