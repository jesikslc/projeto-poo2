package services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelos.Cliente;

public class ClienteService {
    private EntityManagerFactory emf;
        
    public ClienteService(){
        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");
    }
    
    public void salvar(Cliente c){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Cliente> getClientes(){
        EntityManager em = emf.createEntityManager();
        List<Cliente> clientes = em.createQuery("Select c from Cliente c")
                .getResultList();
        em.close();
        
        return clientes;
    }
    
    public Cliente excluir(Cliente c){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Cliente.class, c.getCodigo()));
        em.close();
        return c;        
    }
    
    public Cliente findClienteById(int codigo){
        EntityManager em = emf.createEntityManager();
        Cliente cliente =em.find(Cliente.class, codigo);
        em.close();
        return cliente;
    }

}
