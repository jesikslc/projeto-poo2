package services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelos.Categoria;

public class CategoriaService {    
    private EntityManagerFactory emf;
    
    public CategoriaService(){
        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");
    }
    
    public void salvar(Categoria c){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }
    
    public void editar(Categoria c){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if(em.find(Categoria.class, c.getCodigo())!=null){
            em.merge(c);
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Categoria> getCategorias(){
        EntityManager em = emf.createEntityManager();
        List<Categoria> categorias = em.createQuery("Select c from Categoria c")
                .getResultList();
        em.close();
        
        return categorias;
    }
    
    public void excluir(Categoria c){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Categoria.class, c.getCodigo()));
        em.getTransaction().commit();
        em.close();
    }
    
    public Categoria findCategoriaById(int codigo){
        EntityManager em = emf.createEntityManager();
        Categoria c = em.find(Categoria.class, codigo);
        em.close();
        return c;
    }

}
