package Orieacao_objetos.br.com.educoder.Produtos;
import Orieacao_objetos.br.com.educoder.livraria.Autor;
// mais uma classe que extende de livro
public class MiniLivro extends Livro {
    public MiniLivro(Autor autor){
        super(autor);
    } 
    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        return false;
    }
}
