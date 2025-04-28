package org.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTesteV2 {
    public static void main(String[] args) {

        UtilClass utilClass = new UtilClass();
        List<Computador> listComputador = new ArrayList<>();
        Computador computador1 = new Computador("Computador1");
        Computador computador2 = new Computador("Computador2");
        listComputador.add(computador1);
        listComputador.add(computador2);

        for (Computador computador : listComputador) {

            if (computador.getNome() == null) continue;
            if (computador.getNome().equalsIgnoreCase("computador1")) {
                List<String> listaMouses = new ArrayList<>();
                List<String> listaTeclados = new ArrayList<>();
                List<String> listaProcessadores = new ArrayList<>();
                listaTeclados.addAll(Arrays.asList("Teclado Razer", "Teclado Logitech"));
                listaMouses.addAll(Arrays.asList("Mouse Razer"));
                listaProcessadores.addAll(Arrays.asList("i5"));
                utilClass.addMouseComputador(computador1, listaMouses);
                utilClass.addTecladoComputador(computador1, listaTeclados);
                utilClass.addProcessadorComputador(computador1, listaProcessadores);
            } else if (computador.getNome().equalsIgnoreCase("computador2")) {
                List<String> listaMouses = new ArrayList<>();
                List<String> listaTeclados = new ArrayList<>();
                List<String> listaProcessadores = new ArrayList<>();
                listaTeclados.addAll(Arrays.asList("Teclado Logitech", "Teclado Razer", "Teclado Dell"));
                listaMouses.addAll(Arrays.asList("Mouse Razer", "Mouse Logitech"));
                listaProcessadores.addAll(Arrays.asList("AMD", "i7"));
                utilClass.addMouseComputador(computador2, listaMouses);
                utilClass.addTecladoComputador(computador2, listaTeclados);
                utilClass.addProcessadorComputador(computador2, listaProcessadores);
            }
        }

        for (Computador computador : listComputador) {
            System.out.println("\nNome: " + computador.getNome());
            for (Teclado teclado : computador.getListTeclados()) {
                System.out.println("Teclado: " + teclado.getNome());
            }
            for (Mouse mouse : computador.getListMouse()) {
                System.out.println("Mouse: " + mouse.getNome());
            }
            for (Processador processador : computador.getListProcessador()) {
                System.out.println("Processador: " + processador.getNome());

            }

        }
    }
}