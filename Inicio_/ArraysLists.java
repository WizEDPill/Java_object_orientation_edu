package Inicio_;
import java.util.ArrayList;
public class ArraysLists {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String valor= "conhecendo uma ArrayList";
        lista.add(valor);
        System.out.println(lista.contains(valor));
        lista.remove(valor);
        System.out.println(lista.contains(valor));
        
    }
}
// Essa API do java é muito importante uma vez que ela é capaz de manipular de forma mais completa os arrays que precisam estipular tamanhos fixos. 
//o metodo remove agora pode receber o proprio valor a ser removido. inclusive a posicao também 
//é uma API de collections do java 
//  todos os seus metodos trabalham como object ( se nao para cada tipo de dado precisariamos mencionar que e String por exemplo)
// so temos um problema: ao colocar diversos tipos de objetos em um array como eu saberei o tipo que ele é naquela posicao ? para isso podemos restringir os tipos de objetos em 
// uma determinada lista utilizando um recurso chamado <<generics>>
// exemplo -> ArrayList<Produto> produtos = new ArrayList<Produto>(); estamos indicando que essa lista ira trabalhar com Produtos. 
// dessa forma não será mais necessário um casting para ficar recuperando esse dado na lista.
// Produto buscando = produtos.get(0);
// auxilia na seguranca, pois nao sera possivel adcionar outro tipo de dado 
// ex: produtos.add("Eu nao sou um produto"); 
// https://prnt.sc/d0yeEe5C_-_-
// obs -> ArrayList não é um array, mas usa um array internamente que nao temos acess
// 



