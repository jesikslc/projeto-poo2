package manegedbean.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelos.Cliente;
import services.ClienteService;

@FacesConverter("converterCliente")
public class ConverterCliente implements Converter{

    private ClienteService cservice = new ClienteService();
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        
        Cliente c = null;
        if(string != null && !string.equals(""))
        {
            c = cservice.getClienteByName(string);
        }
        return c;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object cliente) {
        
        if(cliente == null || cliente.equals("")){
            return null;
        }
        else {
            return ((Cliente)cliente).getNome();
        }    
    }
    
}
