package services;

import java.util.ArrayList;
import managedbeans.Dados;
import modelos.Cliente;

public class ClienteService {
    private ArrayList<Cliente> clientes = Dados.getLISTA_CLIENTES();
    
    public void salvar(Cliente c){
        clientes.add(c);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
     public Cliente getClienteByName(String s){
         
        for(Cliente c : clientes){
            if(c.getNome().equals(s)){
                return c;
            }
        }
        return null;
    }
}
