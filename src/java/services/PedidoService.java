package services;

import java.util.ArrayList;
import modelos.Pedido;

public class PedidoService {
    private static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    
    public void salvar(Pedido p){
        pedidos.add(p);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
