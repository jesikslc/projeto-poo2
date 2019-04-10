package managedbeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelos.Cliente;
import modelos.ItemPedido;
import modelos.Pedido;
import modelos.Produto;
import services.ClienteService;
import services.PedidoService;
import services.ProdutoService;

@ManagedBean
@SessionScoped
public class PedidoMB {
    private PedidoService servico = new PedidoService();
    private ClienteService cservice = new ClienteService();
    private ProdutoService pservice = new ProdutoService();
    private Pedido p = new Pedido();
    private ItemPedido i = new ItemPedido();
    private Produto produtoescolhido;
    private Cliente clienteescolhido;
    private Pedido pedidoescolhido;

    public void salvarItem(){
        i.setProduto(produtoescolhido);
        p.AdionarItem(i);
        i = new ItemPedido();
        produtoescolhido = null;
    }
    
    public void salvar()
    {
        if(clienteescolhido != null){
            p.setCliente(clienteescolhido);
            clienteescolhido.addPedido(p);
        }
        servico.salvar(p);
        p = new Pedido();
        clienteescolhido = null;
    }

    public Pedido getPedidoescolhido() {
        return pedidoescolhido;
    }

    public void setPedidoescolhido(Pedido pedidoescolhido) {
        this.pedidoescolhido = pedidoescolhido;
    }
 
    public Pedido getP() {
        return p;
    }

    public void setP(Pedido p) {
        this.p = p;
    }
    
    public List<Pedido> getPedidos()
    {
        return servico.getPedidos();
    }

    public void setClienteescolhido(Cliente clienteescolhido) {
        this.clienteescolhido = clienteescolhido;
    }
    
     public Cliente getClienteescolhido() {
        return clienteescolhido;
    }

    public Produto getProdutoescolhido() {
        return produtoescolhido;
    }

    public void setProdutoescolhido(Produto produtoescolhido) {
        this.produtoescolhido = produtoescolhido;
    }

    public List<Cliente> getClientes() {
        return cservice.getClientes();
    }
    
    public List<Produto> getProdutos(){
        return pservice.getProdutos();
    }

    public ItemPedido getI() {
        return i;
    }

    public void setI(ItemPedido i) {
        this.i = i;
    }
}
