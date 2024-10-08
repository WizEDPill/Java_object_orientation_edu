import Orieacao_objetos.br.com.educoder.Produtos.LivroFisico;
import Orieacao_objetos.br.com.educoder.Produtos.Produto;
import Orieacao_objetos.br.com.educoder.Produtos.Ebook;
import Orieacao_objetos.br.com.educoder.livraria.Autor;
//import java.util.ArrayList;
import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Carlos Drumond");

        LivroFisico fisico = new LivroFisico(autor); // o fisico vai criar um LivroFisico
        fisico.setNome("Test-This-book");
        fisico.setValor(30.99);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-This-book");
        ebook.setValor(59.50);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal()); // AQUI EU IMPRIMO O TOTAL

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + fisico.getValor());
        }

        List<Produto> produtos = carrinho.getProdutos();
        produtos.forEach(l->System.out.println(produtos)); // usei o lambda + foorEach para fazer essa operacao e deixei ela bem mais simples. 
        
    }
}