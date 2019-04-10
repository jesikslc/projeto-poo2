package services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelos.Pedido;

public class PedidoService {
    private EntityManagerFactory emf;

    public PedidoService(){
        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");
    }
    
    public void salvar(Pedido p){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Pedido> getPedidos(){
        EntityManager em = emf.createEntityManager();
        List<Pedido> pedidos = em.createQuery("Select p from Pedido p")
                .getResultList();
        em.close();

        return pedidos;
    }
    
    public void excluir(Pedido p){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Pedido.class, p.getNumero()));
        em.getTransaction().commit();
        em.close();
    }
    
    public Pedido findPedidoById(int numero){
        EntityManager em = emf.createEntityManager();
        Pedido p = em.find(Pedido.class, numero);
        em.close();
        return p;
    }
}
