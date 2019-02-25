package services;

import java.util.ArrayList;
import managedbeans.Dados;
import modelos.Categoria;

public class CategoriaService {
    private ArrayList<Categoria> categorias = Dados.getLISTA_CATEGORIAS();
    
    public void salvar(Categoria c){
        categorias.add(c);
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    
    public Categoria getCategoriaByDescricao(String s)
    {
        for(Categoria c : categorias)
        {
            if(c.getDescricao().equals(s))
                return c;
        }
        return null;
    }
}
