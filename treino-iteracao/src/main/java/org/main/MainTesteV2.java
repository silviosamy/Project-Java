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
            List<String> listaMouses = new ArrayList<>();
            if (computador.getNome() == null) continue;
            if (computador.getNome().equalsIgnoreCase("Computador1")) {
                listaMouses.addAll(Arrays.asList("Razer", "Logitech"));
                utilClass.addMouseComputador(computador1, listaMouses);
            }
        }

        for (Computador computador : listComputador) {
            System.out.println(computador.getNome());
            if (computador.getListMouse() == null)
                continue;
            for (Mouse mouse : computador.getListMouse()) {
                System.out.println(mouse.getNome());
            }
        }

    }
}
