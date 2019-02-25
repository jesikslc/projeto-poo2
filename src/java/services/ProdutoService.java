package services;

import java.util.ArrayList;
import managedbeans.Dados;
import modelos.Produto;

public class ProdutoService {
    private ArrayList<Produto> produtos = Dados.getLISTA_PRODUTOS();
    
    public void salvar(Produto p){
        produtos.add(p);
    }
    
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    
    public Produto getProdutobyName(String s){
        
        for (Produto p : produtos)
        {
            if(p.getNome().equals(s))
                return p;
        }
        return null;
    }
}
