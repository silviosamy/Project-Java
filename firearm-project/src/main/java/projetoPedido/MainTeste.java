package projetoPedido;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {

        UtilClass utilClass = new UtilClass();
        List<Cliente> listClientes = new ArrayList<>();
        List<Pedido> listPedidos = new ArrayList<>();

        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Roberto");
        listClientes.add(cliente1);
        listClientes.add(cliente2);
        listClientes.add(cliente3);

        Pedido pedido1 = new Pedido("Roupas");
        Pedido pedido2 = new Pedido("AK47");
        Pedido pedido3 = new Pedido("Anel");
        Pedido pedido4 = new Pedido("Computador");
        Pedido pedido5 = new Pedido("Gibi");
        Pedido pedido6 = new Pedido("CD");

        cliente1.adicionarItem(pedido1);
        cliente1.adicionarItem(pedido2);
        cliente2.adicionarItem(pedido3);
        cliente2.adicionarItem(pedido4);
        cliente3.adicionarItem(pedido5);
        cliente3.adicionarItem(pedido6);

        //for (Cliente cliente : listClientes) {
        //  System.out.println("\nNome: " + cliente.getNome());
        // System.out.println("Pedido: " + cliente.getListPedidos());
        //}
        //System.out.println();
        //utilClass.verificarPedido(listClientes);
        for (Cliente cliente : listClientes) {
            System.out.println("\nNome: " + cliente.getNome());
            System.out.println("Pedido: " + cliente.getListPedidos());
            utilClass.verificarPedido1(cliente.getListPedidos(), cliente.getNome());
        }
    }
}
