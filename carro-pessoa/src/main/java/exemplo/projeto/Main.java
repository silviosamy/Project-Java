package exemplo.projeto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Criar listas
        List<Pessoa> listPessoas = new ArrayList<>();
        List<Problema> listProblemas = new ArrayList<>();
        List<Problema> listProblemas1 = new ArrayList<>();
        List<Problema> listProblemas2 = new ArrayList<>();
        List<Carro> listCarros = new ArrayList<>();

        //Instanciar pessoas
        Pessoa pessoa = new Pessoa("Silvio");

        //Instanciando os carros
        Carro carro1 = new Carro("Kombi");
        Carro carro2 = new Carro("Ferrari");

        //Definindo a lista de problemas
        listProblemas1.add(new Problema("Caro de manter"));
        listProblemas1.add(new Problema("Ruim de estacionar"));

        listProblemas2.add(new Problema("Caro para comprar"));
        listProblemas2.add(new Problema("Manutenção cara"));
        listProblemas2.add(new Problema("Bebe muito"));
        //Setando os problemas em cada carro
        carro1.setListProblemas(listProblemas1);
        carro2.setListProblemas(listProblemas2);


        //Colocar os objetos no ArrayList
        listCarros.add(carro1);
        listCarros.add(carro2);
        pessoa.setListCarros(listCarros);
        listPessoas.add(pessoa);


        for (Pessoa pessoa1 : listPessoas) {
            System.out.println("Nome: " + pessoa1.getNome());
            for (Carro carro : pessoa1.getListCarros()) {
                System.out.println("\nCarro: " + carro.getNome());
                for (Problema problema : carro.getListProblemas()) {
                    System.out.println(problema.getNome());
                }
            }
        }
    }
}
