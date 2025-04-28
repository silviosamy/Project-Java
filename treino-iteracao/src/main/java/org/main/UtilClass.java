package org.main;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    public List<Mouse> addMouseComputador(Computador computador, List<String> listMouses) {
        List<Mouse> mousesList = new ArrayList<>();
        for (String modelo : listMouses) {
            mousesList.add(new Mouse(modelo));
            computador.setListMouse(mousesList);
        }
        return mousesList;
    }

    public List<Teclado> addTecladoComputador(Computador computador, List<String> listTeclados) {
        List<Teclado> tecladosList = new ArrayList<>();
        for (String modelo : listTeclados) {
            tecladosList.add(new Teclado(modelo));
            computador.setListTeclados(tecladosList);
        }
        return tecladosList;
    }

    public List<Processador> addProcessadorComputador(Computador computador, List<String> listProcessadores) {
        List<Processador> listProcessador = new ArrayList<>();
        for (String modelo : listProcessadores) {
            listProcessador.add(new Processador(modelo));
            computador.setListProcessador(listProcessador);
        }
        return listProcessador;
    }

}
