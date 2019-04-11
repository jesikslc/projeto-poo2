package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ITEMPEDIDO")
public class ItemPedido implements Serializable {
    @Id
    private int numero;
    private int quantidade;
    private Produto produto;
    
    public double totalItem(){
        if(this.produto != null)
            return produto.getPreco()*quantidade;
        return 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public double getImposto(){
        if(this.produto != null)
            return produto.getImposto()*quantidade;
        
        return 0;
    }
}
