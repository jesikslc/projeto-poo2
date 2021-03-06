package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {
    @Id
    private int codigo;
    private int moeda;
    private String nome;
    @OneToOne
    @JoinColumn(name = "codigo")
    private Categoria categoria;
    private double preco, imposto;

    public Produto(int codigo, int moeda, String nome, Categoria categoria, double preco, double imposto){
        this.codigo = codigo;
        this.moeda = moeda;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.imposto = imposto;
    }
    
    public Produto()
    {
    
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
