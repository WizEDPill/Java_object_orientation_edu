package Orieacao_objetos.br.com.educoder.Produtos;
import Orieacao_objetos.br.com.educoder.livraria.Editora;

public class Revista implements Produto,Promocional {
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora; 
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem>0.1){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
    @Override
    public int compareTo(Produto outro){
       return (int) (this.getValor()- outro.getValor()); // retornando tipo int um menos o outro
    }
}
