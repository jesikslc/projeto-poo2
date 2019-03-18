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
        //em.persist(c);
        em.merge(c);
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
    
    public Categoria findCategoriaById(int codigo){
        EntityManager em = emf.createEntityManager();
        Categoria c = em.find(Categoria.class, codigo);
        em.close();
        return c;
    }
//
//    public Categoria getCategoriaByDescricao(String s)
//    {
//        for(Categoria c : categorias)
//        {
//            if(c.getDescricao().equals(s))
//                return c;
//        }
//        return null;
//    }
}
