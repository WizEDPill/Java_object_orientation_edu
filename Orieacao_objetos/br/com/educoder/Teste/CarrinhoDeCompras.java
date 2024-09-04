package Orieacao_objetos.br.com.educoder.Teste;
import Orieacao_objetos.br.com.educoder.Produtos.Produto;
//import Orieacao_objetos.br.com.educoder.Produtos.Livro;
//import Orieacao_objetos.br.com.educoder.Produtos.Revista;
/*public class CarrinhoDeCompras {
    public void adiciona(LivroFisico livro){
        System.out.println("Adicionado: " + livro);
    }
    public void adiciona(Ebook livro){
        System.out.println("Adicionado: " +livro);
    }
}*/
//Polimorfismo ->
public class CarrinhoDeCompras {
    protected double total;
    private Produto[] produtos = new Produto[10]; // montamos nosso array de produtos é obrigatorio definir o tamanho do array no caso de 10 posicoes
    public void adiciona(Produto produto){
        System.out.println("Adicionando: " +produto);
        this.produtos[1]=produto; //estamos adicionando todos os produtos na posicao 1 do array (que no caso e a segunda posicao , assim indo de 0 a 9 no caso 10 posicoes)
        this.total += produto.getValor();//vai somar o valor de todos os produtos
        
    }
    public Produto[] getProdutos(){
        CarrinhoDeCompras carrinho;
        Produto[] produtos= carrinho.getProdutos();
        for(int i=0; i< produtos.length; i++){
        Produto produto= produtos[i];
        if(produto !=null){
            System.out.println(produto.getValor());
        }
    
}

    

    
    



    /* 
    public void adiciona(Livro livro){
        System.out.println("Adicionando:    "+ livro);
        livro.aplicaDescontoDe(.05);
        total += livro.getValor();
    }
    public void adiciona(Revista revista){
        System.out.println("Adicionando:    "+revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }
    public double getTotal(){
        return total; // quando fizer o get total vai retornar o total
    }
    */

}
  
