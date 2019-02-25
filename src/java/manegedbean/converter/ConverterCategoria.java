package manegedbean.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelos.Categoria;
import services.CategoriaService;

@FacesConverter("converterCategoria")
public class ConverterCategoria implements Converter {

    private CategoriaService servico = new CategoriaService();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        Categoria c = null;
        if (value != null && !value.equals("")) {
            c = servico.getCategoriaByDescricao(value);
        }

        return c;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic,
            Object categoria) {
        if (categoria == null || categoria.equals("")) {
            return null;
        } else {
            return ((Categoria)categoria).getDescricao();
        }
    }
}
