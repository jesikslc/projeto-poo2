package modelos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTOEXPORTACAO")
public class ProdutoExportacao extends Produto {
    private String destino;
    
    public ProdutoExportacao(int codigo, int moeda, String nome, Categoria categoria, 
            double preco, double imposto, String destino)
    {
        super(codigo, moeda, nome, categoria, preco, imposto);
        this.destino = destino;
    }
    
    public ProdutoExportacao(){
    
    }
    
    public String getDestino(){
        return destino;
    }
    
    public void setDestino(String destino){
        this.destino = destino;
    }    
}
