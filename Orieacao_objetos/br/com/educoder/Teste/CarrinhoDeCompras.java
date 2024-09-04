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
    private Produto[] produtos = new Produto[10];
    private int indice = 0; // Variável para controlar a posição livre no array

    public void adiciona(Produto produto) {
        if (indice < produtos.length) {
            System.out.println("Adicionando: " + produto);
            this.produtos[indice] = produto; // Adiciona o produto na próxima posição livre
            this.total += produto.getValor(); // Soma o valor do produto ao total
            indice++; // Incrementa a posição livre
        } else {
            System.out.println("Carrinho cheio! Não é possível adicionar mais produtos.");
        }
    }

    public Produto[] getProdutos() {
        for (int i = 0; i < produtos.length; i++) { // Corrige o loop
            Produto produto = produtos[i];
            if (produto != null) {
                System.out.println(produto.getValor());
            }
        }
        return produtos; // Adiciona o retorno dos produtos
    }
    //metodo para receber o total 
    public double getTotal(){
        return this.total;
    }
}
