package managedbeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Categoria;
import modelos.Produto;
import modelos.ProdutoExportacao;
import modelos.ProdutoMercadoInterno;
import services.CategoriaService;
import services.ProdutoService;

@ManagedBean
@SessionScoped
public class ProdutoMB {
    private ProdutoService servico = new ProdutoService();
    private CategoriaService categoriaservice = new CategoriaService();
    private Categoria categoriaescolhida;
    private Produto prod = new ProdutoMercadoInterno();
    private Produto produtoescolhido;
    private int tipo = 1;
    
    public void salvar(){
        if(categoriaescolhida != null){
            prod.setCategoria(categoriaescolhida);
        }
        servico.salvar(prod);
        if(tipo == 1)
        {
            prod = new ProdutoMercadoInterno();
        }
        else if(tipo == 2)
        {
            prod = new ProdutoExportacao();
        }
        categoriaescolhida=null;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
        if(tipo == 1)
        {
            prod = new ProdutoMercadoInterno();
        }
        else if(tipo == 2)
        {
            prod = new ProdutoExportacao();
        }
    }
    
    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }
    
    public List<Produto> getProdutos(){
        return servico.getProdutos();
    }

    public Produto getProdutoescolhido() {
        return produtoescolhido;
    }

    public void setProdutoescolhido(Produto produtoescolhido) {
        this.produtoescolhido = produtoescolhido;
    }

    public Categoria getCategoriaescolhida() {
        return categoriaescolhida;
    }

    public void setCategoriaescolhida(Categoria categoriaescolhida) {
        this.categoriaescolhida = categoriaescolhida;
    }
    
    public List<Categoria> getCategorias()
    {
        return categoriaservice.getCategorias();
    }
}
