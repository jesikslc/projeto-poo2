package managedbeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Cliente;
import services.ClienteService;

@ManagedBean
@SessionScoped
public class ClienteMB {
    private ClienteService servico = new ClienteService();
    private Cliente cli = new Cliente();
    private Cliente clienteescolhido;
    
    public void salvar(){
        servico.salvar(cli);
        cli = new Cliente();
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public List<Cliente> getClientes(){
        return servico.getClientes();
    }

    public Cliente getClienteescolhido() {
        return clienteescolhido;
    }

    public void setClienteescolhido(Cliente clienteescolhido) {
        this.clienteescolhido = clienteescolhido;
    }
}
