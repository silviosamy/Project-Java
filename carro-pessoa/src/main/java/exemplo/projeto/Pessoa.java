package exemplo.projeto;

import java.util.List;

public class Pessoa {

    private String nome;
    private List<Carro> listCarros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.listCarros = listCarros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getListCarros() {
        return listCarros;
    }

    public void setListCarros(List<Carro> listCarros) {
        this.listCarros = listCarros;
    }
}