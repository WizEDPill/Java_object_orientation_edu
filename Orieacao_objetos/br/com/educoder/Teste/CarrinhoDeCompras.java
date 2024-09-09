
import Orieacao_objetos.br.com.educoder.Produtos.Produto;
import java.util.ArrayList;
import java.util.List;

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
    private double total; 
    private List<Produto> produtos; 
    public CarrinhoDeCompras(){
        this.produtos=new ArrayList<Produto>();
    }
    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }
    public void remove(int posicao){
        this.produtos.remove(posicao);
    }
    public double getTotal(){
        return total;
    }
    public List<Produto> getProdutos(){
        return produtos;
    }
    
}

//https://prnt.sc/l3p2wVnA2VY4 a observação que temos a interface List e algumas de suas implementacoes. 

/*
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
    //metodo para receber o total 
    public double getTotal(){
        return this.total;
    }
    public Produto[] getProdutos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdutos'");
    }
}
 */