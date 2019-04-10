package managedbeans;

import java.util.ArrayList;
import modelos.Categoria;
import modelos.Cliente;
import modelos.Produto;
import modelos.ProdutoMercadoInterno;
import modelos.ProdutoExportacao;

public class Dados {
    private static ArrayList<Categoria> LISTA_CATEGORIAS;
    private static ArrayList<Produto> LISTA_PRODUTOS;
    private static ArrayList<Cliente> LISTA_CLIENTES;
    
    private static void init() {
       
        LISTA_CATEGORIAS = new ArrayList();
        LISTA_PRODUTOS = new ArrayList();
        LISTA_CLIENTES = new ArrayList();
        
        LISTA_CATEGORIAS.add(new Categoria("Alimentos"));
        LISTA_CATEGORIAS.add(new Categoria("Brinquedos"));
        LISTA_CATEGORIAS.add(new Categoria("Jogos"));
        
        LISTA_PRODUTOS.add(new ProdutoExportacao(1, 2, "Call of duty - BO4", LISTA_CATEGORIAS.get(2), 200, 50, "USA"));
        LISTA_PRODUTOS.add(new ProdutoExportacao(2, 2, "GTA V", LISTA_CATEGORIAS.get(2), 150, 30, "USA"));
        LISTA_PRODUTOS.add(new ProdutoMercadoInterno(3, 1, "Batata", LISTA_CATEGORIAS.get(0), 30, 5, true));
        LISTA_PRODUTOS.add(new ProdutoMercadoInterno(4, 1, "Mandioca", LISTA_CATEGORIAS.get(0), 25, 3, false));
        LISTA_PRODUTOS.add(new ProdutoExportacao(5, 2, "Boneco Ben 10", LISTA_CATEGORIAS.get(1), 100, 10, "Japão"));
        LISTA_PRODUTOS.add(new ProdutoExportacao(6, 2, "Carrinho CTRL RMT", LISTA_CATEGORIAS.get(1), 70, 5, "China"));
        
        LISTA_CLIENTES.add(new Cliente(1, 2, "Danilo Barbosa", "Rua Manoel Teixeira", "1532227122", 2000));
        LISTA_CLIENTES.add(new Cliente(2, 1, "Fabiana Masini", "Rua Vitoria", "15981101020", 10000));
        LISTA_CLIENTES.add(new Cliente(3, 2, "Manoel Aparecido", "Rua Paraná", "15997203030", 2500));
    }

    public static ArrayList<Categoria> getLISTA_CATEGORIAS() {
        if(LISTA_CATEGORIAS == null)
            init();
       
        return LISTA_CATEGORIAS;
    }

    public static ArrayList<Produto> getLISTA_PRODUTOS() {
        if(LISTA_PRODUTOS == null)
            init();
        
        return LISTA_PRODUTOS;
    }

    public static ArrayList<Cliente> getLISTA_CLIENTES() {
        if(LISTA_CLIENTES == null)
            init();
        
        return LISTA_CLIENTES;
    }
}
