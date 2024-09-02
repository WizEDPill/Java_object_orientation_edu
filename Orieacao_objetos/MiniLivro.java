package Orieacao_objetos;
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
