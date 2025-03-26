package projetoPedido;

public class Pedido {

    private String nome;

    public Pedido(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void setNome(String item) {
        this.nome = nome;
    }
}
