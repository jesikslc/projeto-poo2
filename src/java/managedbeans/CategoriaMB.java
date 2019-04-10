package managedbeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelos.Categoria;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import services.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaMB {
    private CategoriaService servico = new CategoriaService();
    private Categoria categoria = new Categoria();
    private List<Categoria> categorias;
    
    public List<Categoria> getCategorias(){
        return servico.getCategorias();
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public void salvar(){
        servico.salvar(categoria);
        categoria = new Categoria();
    }
    
    public void excluir(Categoria c){
        servico.excluir(c);
    }
     
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
