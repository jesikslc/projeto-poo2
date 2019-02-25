package modelos;

import java.util.ArrayList;

public class Cliente {
    private int codigo, status;
    private String nome, endereco, telefone;
    private double limite;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public Cliente(int codigo, int status, String nome, String endereco, String telefone, double limite){
        this.codigo = codigo;
        this.status = status;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.limite = limite;
    }
    
    public Cliente(){
    
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
