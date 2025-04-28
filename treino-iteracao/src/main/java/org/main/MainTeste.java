package org.main;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        List<Computador> listComputador = new ArrayList<>();
        listComputador.add(new Computador("Computador1"));
        listComputador.add(new Computador("Computador2"));

        for (Computador computador : listComputador) {
            if (computador.getNome() == null) continue;
            if (computador.getNome().equalsIgnoreCase("Computador1")) {
                List<Teclado> listTeclados = new ArrayList<>();
                List<Mouse> listMouses = new ArrayList<>();
                List<Processador> listProcessadores = new ArrayList<>();
                listTeclados.add(new Teclado("Teclado Razer"));
                listTeclados.add(new Teclado("Teclado Logitech"));
                listMouses.add(new Mouse("Mouse Razer"));
                listProcessadores.add(new Processador("i5"));
                computador.setListTeclados(listTeclados);
                computador.setListMouse(listMouses);
                computador.setListProcessador(listProcessadores);
            } else if (computador.getNome().equalsIgnoreCase("Computador2")) {
                List<Teclado> listTeclados = new ArrayList<>();
                List<Mouse> listMouses = new ArrayList<>();
                List<Processador> listProcessadores = new ArrayList<>();
                listTeclados.add(new Teclado("Teclado Logitech"));
                listTeclados.add(new Teclado("Teclado Razer"));
                listTeclados.add(new Teclado("Teclado Dell"));
                listMouses.add(new Mouse("Mouse Razer"));
                listMouses.add(new Mouse("Mouse Logitech"));
                listProcessadores.add(new Processador("AMD"));
                listProcessadores.add(new Processador("i7"));
                computador.setListTeclados(listTeclados);
                computador.setListMouse(listMouses);
                computador.setListProcessador(listProcessadores);
            }
        }
    }
}
