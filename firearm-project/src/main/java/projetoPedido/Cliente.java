package projetoPedido;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Pedido> listPedidos;

    public Cliente(String nome) {
        this.nome = nome;
        this.listPedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedido> getListPedidos() {
        return listPedidos;
    }

    public void setListPedidos(List<Pedido> listPedidos) {
        this.listPedidos = listPedidos;
    }

    public void adicionarItem(Pedido pedido) {
        this.listPedidos.add(pedido);
    }

}
