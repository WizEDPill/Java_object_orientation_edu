package Orieacao_objetos;

public class Ebook extends Livro {
    // ele herda extends metodos e atributos de livro mas apresenta somente uma coisa difente que é o waterMark
    private String waterMark;
    
    public void setWaterMark(String waterMark){
        this.waterMark= waterMark;
    }
    public String geWaterMark(){
        return waterMark;// retornar um valor de mark (dono do livro digital)
    }
    //getters, setter e outro metodos;
    public Ebook(Autor autor){
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem> 0.15){
            return false;
        }
        double desconto= this.getValor()*porcentagem;// to pegando o valor ja recebido e fazendo a operação
        this.setValor(this.getValor() - desconto); // seto o novo valor que é o valor antigo getValor- o desconto feito ali encima) 
        return true; 
    }

}
