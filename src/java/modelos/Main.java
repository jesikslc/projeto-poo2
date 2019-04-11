/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import services.CategoriaService;
import services.ClienteService;
import services.ProdutoService;

/**
 *
 * @author W10
 */
public class Main {
    
    public static void main(String args[]){
    
        CategoriaService servicoCat = new CategoriaService();
        ClienteService servicoCli = new ClienteService();
        ProdutoService servicoProduto = new ProdutoService();

        Categoria cat1 = new Categoria("Infantil");
        Categoria cat2 = new Categoria("Alimentação");
        Categoria cat3 = new Categoria("Música");

        Cliente cli1 = new Cliente(1, 10, "Fabiana Masini", "Rua de teste, 123 - Vila teste",
            "15667774386", 1200);
        Cliente cli2 = new Cliente(2, 20, "Thiago Vieira", "Rua de teste 2, 345 - Vila teste 2",
            "14556664378", 1300);
        Cliente cli3 = new Cliente(3, 30, "Jéssica", "Rua de teste 3, 456 - Vila teste 3",
            "12556664732", 1000);
        
        Produto prod1 = new Produto(1, 2, "Violão", cat3, 2000, 20);
        Produto prod2 = new Produto(2, 3, "Boneca", cat1, 30, 10);
        Produto prod3 = new Produto(3, 4, "Macarrão", cat2, 10, 20);
        
        Pedido ped1 = new Pedido();
        Pedido ped2 = new Pedido();
        Pedido ped3 = new Pedido();
        

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");       

        servicoCat.salvar(cat1);
        servicoCat.salvar(cat2);
        servicoCat.salvar(cat3);
        
        servicoCli.salvar(cli1);
        servicoCli.salvar(cli2);
        servicoCli.salvar(cli3);
        
        servicoProduto.salvar(prod1);
        servicoProduto.salvar(prod2);
        servicoProduto.salvar(prod3);
    }
    
}
