package manegedbean.converter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelos.Produto;
import services.ProdutoService;

@FacesConverter("converterProduto")
public class ConverterProduto implements Converter{
    private ProdutoService servico = new ProdutoService();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String s) {
        
        Produto p = null;
        if(s != null && !s.equals(""))
        {
            //p = servico.getProdutobyName(s);
        }
        return p;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object prod) {
        if(prod == null || prod.equals(""))
            return null;
        else
        {
            return ((Produto)prod).getNome();
        }
    }
}
