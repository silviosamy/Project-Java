package projetoPedido;

import java.util.List;

public class UtilClass {

    List<Cliente> listClientes;
    List<Pedido> listPedidos;

    public void verificarPedido(List<Cliente> listClientes) {
        for (Cliente cliente : listClientes) {
            for (Pedido pedido : cliente.getListPedidos()) {
                if (pedido.getNome().equals("AK47")) {
                    System.out.println("Notificação ao governo enviada, " +
                            cliente.getNome() + " adquiriu uma AK47");
                }
            }
        }
    }

    public void verificarPedido1(List<Pedido> listPedidos, String nome) {
        for (Pedido pedido : listPedidos) {
            if (pedido.getNome() != null && pedido.getNome().equals("AK47")) {
                System.out.printf("Notificação ao governo enviada, %s adquiriu uma AK47", nome);
            }
        }

    }
}

