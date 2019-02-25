package managedbeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Categoria;
import services.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaMB {
    private CategoriaService servico = new CategoriaService();
    private Categoria categoria = new Categoria();
    
     public void salvar(){
        servico.salvar(categoria);
        categoria = new Categoria();
    }
     
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
     public List<Categoria> getCategorias(){
        return servico.getCategorias();
    }
}
