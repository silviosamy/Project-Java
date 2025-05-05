package org.exemplo.agendacontatos;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda("Agenda");
        List<Contato> listContatos = new ArrayList<>();
        listContatos.add(adicionarContato("Silvio", 99990000,
                "silvio@email.com"));
        listContatos.add(adicionarContato("Rafael", 12349211, "teste@email.com"));
        agenda.setListContatos(listContatos);


        for (Contato contato : listContatos) {
            System.out.println(contato.getNome());
        }
        System.out.println("Total: " + listContatos.size());
        deletarContato(listContatos, "Silvio");
        System.out.println("Depois do delete: " + listContatos.size());
        buscarContato(listContatos, "Rafael");

    }

    public static Contato adicionarContato(String nome, int numero, String email) {
        Contato contato = new Contato(nome, numero, email);
        return contato;
    }

    public static void deletarContato(List<Contato> listContatos, String nome) {
        for (Contato contato : listContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                listContatos.remove(contato);
            }
        }
    }

    public static void buscarContato(List<Contato> listContatos, String nome) {
        for (Contato contato : listContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome encontrado: " + nome);
            } else {
                System.out.println("Contato não encontrado");
            }
        }

    }
}


