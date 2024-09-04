package Orieacao_objetos.br.com.educoder.Produtos;

public interface Promocional {
    boolean aplicaDescontoDe(double porcentagem);
    
    default boolean aplicaDescontoDe10Porcento(){
        return aplicaDescontoDe(0.1);
    }
}
