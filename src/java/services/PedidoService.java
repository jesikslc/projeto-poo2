package services;

import java.util.ArrayList;
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
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }
    
    public void editar(Pedido p){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if(em.find(Pedido.class, p.getNumero())!=null){
            em.merge(p);
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Pedido> getCategorias(){
        EntityManager em = emf.createEntityManager();
        List<Pedido> pedidos = em.createQuery("Select p from Pedido p")
                .getResultList();
        em.close();
        
        return pedidos;
    }

}
