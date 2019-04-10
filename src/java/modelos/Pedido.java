package modelos;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private long numero;
    private Date data;
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
    private Cliente cliente;
    
    public double totalPedido(){
        double total = 0;
        for (ItemPedido i : itens){ total += i.totalItem(); }
        return total;
    }
    
    public double totalImposto(){
        double total = 0;
        for(ItemPedido i : itens){ total += i.getImposto(); }
        return total;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }
    
    public void AdionarItem(ItemPedido i)
    {
        itens.add(i);
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
