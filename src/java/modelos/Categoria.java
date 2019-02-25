package modelos;

public class Categoria {
    private String descricao;

    public Categoria(String descricao){
        this.descricao = descricao;
    }
    
    public Categoria(){

    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
