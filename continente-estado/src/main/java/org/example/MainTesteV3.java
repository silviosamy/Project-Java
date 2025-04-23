package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTesteV3 {
    public static void main(String[] args) {

        UtilClass utilClass = new UtilClass();
        List<Continente> listContinentes = new ArrayList<>();
        Continente continente1 = new Continente("América do Sul");
        Continente continente2 = new Continente("Europa");
        Continente continente3 = new Continente("Ásia");
        listContinentes.add(continente1);
        listContinentes.add(continente2);
        listContinentes.add(continente3);


        for (Continente continente : listContinentes) {
            if (continente.getNome().equalsIgnoreCase("América do Sul")) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Brasil", "Argentina"));
                continente.setListPais(utilClass.criaPaises(listPaises));
            } else if (continente.getNome().equalsIgnoreCase("Europa")) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Inglaterra", "Itália"));
                continente.setListPais(utilClass.criaPaises(listPaises));
            } else if (continente.getNome().equalsIgnoreCase("Ásia")) {
                List<String> listPaises = new ArrayList<>(Arrays.asList("Japão", "China"));
                continente.setListPais(utilClass.criaPaises(listPaises));
            }
        }

        for (Continente continente : listContinentes) {
            for (Pais pais : continente.getListPais()) {
                if (pais.getNome().equalsIgnoreCase("Brasil")) {
                    List<Estado> listEstados = new ArrayList<>();
                    listEstados.add(new Estado("Santa Catarina"));
                    pais.setListEstados(listEstados);
                } else if (pais.getNome().equalsIgnoreCase("Inglaterra")) {
                    List<Estado> listEstados = new ArrayList<>();
                    listEstados.add(new Estado("Londres"));
                    pais.setListEstados(listEstados);
                } else if (pais.getNome().equalsIgnoreCase("Japão")) {
                    List<Estado> listEstados = new ArrayList<>();
                    listEstados.add(new Estado("Toquio"));
                    pais.setListEstados(listEstados);
                }

            }
        }

        for (Continente continente : listContinentes) {
            for (Pais pais : continente.getListPais()) {
                for (Estado estado : pais.getListEstados()) {
                    if (estado.getNome().equalsIgnoreCase("Santa Catarina")) {
                        List<Cidade> listCidades = new ArrayList<>();
                        listCidades.add(new Cidade("Joinville"));
                        estado.setListCidades(listCidades);
                    } else if (estado.getNome().equalsIgnoreCase("Londres")) {
                        List<Cidade> listCidades = new ArrayList<>();
                        listCidades.add(new Cidade("Cidade de Londres"));
                        estado.setListCidades(listCidades);
                    } else if (estado.getNome().equalsIgnoreCase("Toquio")) {
                        List<Cidade> listCidades = new ArrayList<>();
                        listCidades.add(new Cidade("Cidade de Toquio"));
                        estado.setListCidades(listCidades);
                    }
                }
            }
        }

        for (Continente continente : listContinentes) {
            for (Pais pais : continente.getListPais()) {
                for (Estado estado : pais.getListEstados()) {
                    for (Cidade cidade : estado.getListCidades()) {
                        if (cidade.getNome().equalsIgnoreCase("Joinville")) {
                            List<Bairro> listBairros = new ArrayList<>();
                            listBairros.add(new Bairro("América"));
                            listBairros.add(new Bairro("Glória"));
                            cidade.setListBairros(listBairros);
                        } else if (cidade.getNome().equalsIgnoreCase("Cidade de Londres")) {
                            List<Bairro> listBairros = new ArrayList<>();
                            listBairros.add(new Bairro("Manchester"));
                            cidade.setListBairros(listBairros);
                        } else if (cidade.getNome().equalsIgnoreCase("Cidade de Toquio")) {
                            List<Bairro> listBairros = new ArrayList<>();
                            listBairros.add(new Bairro("Suzuka"));
                            cidade.setListBairros(listBairros);
                        }
                    }
                }
            }
        }


        /*for (Continente continente : listContinentes) {
            System.out.println("\nContinente: " + continente.getNome() + "\nPaíses: ");
            for (Pais pais : continente.getListPais()) {
                System.out.println(pais.getNome() + "\nEstados:");
                for (Estado estado : pais.getListEstados()) {
                    System.out.println(estado.getNome() + "\nCidades: ");
                    for (Cidade cidade : estado.getListCidades()) {
                        System.out.println(cidade.getNome() + "\nBairros:");
                        for (Bairro bairro : cidade.getListBairros()) {
                            System.out.println(bairro.getNome());
                        }
                    }
                }
            }
        }*/

        for (Continente continente : listContinentes) {
            System.out.println(continente.getNome());
            for (Pais pais : continente.getListPais()) {
                System.out.println(pais.getNome());
            }
        }
    }
}
