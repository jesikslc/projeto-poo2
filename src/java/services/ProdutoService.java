package services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelos.Produto;

public class ProdutoService {
    EntityManagerFactory emf;
    
    public ProdutoService(){
        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");
    }
    
    public void salvar(Produto p){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();  
    }
    
    public void editar(Produto p){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if(em.find(Produto.class, p.getCodigo())!=null){
            em.merge(p);
        }
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Produto> getProdutos(){
        EntityManager em = emf.createEntityManager();
        List<Produto> produtos = em.createQuery("Select p from Produto p")
                .getResultList();
        em.close();
        
        return produtos;
    }
    
    public void excluir(Produto p){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Produto.class, p.getCodigo()));
        em.getTransaction().commit();
        em.close();
    }
    
    public Produto findProdutoById(int codigo){
        EntityManager em = emf.createEntityManager();
        Produto p = em.find(Produto.class, codigo);
        em.close();
        return p;
    }
}
