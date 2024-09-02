package Orieacao_objetos;
public class RegrasDeDesconto{
    public static void main(String[] args) {
        Autor autor= new Autor();
        autor.setNome("Eduard");
        LivroFisico livro= new LivroFisico(autor);
        livro.setValor(59.90);
        
        Livro livrinho= new MiniLivro(autor);
        livrinho.setValor(10.50);

        if(!livro.aplicaDescontoDe(0.3)){
            System.out.println("Desconto no livro nao pode ser maior do que 30%");
        }else{
            System.out.println("Valor do livro com desconto:    "+livro.getValor());
        }
        Ebook ebook= new Ebook(autor);
        ebook.setValor(29.90);
        if(!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto no ebook nao pode ser maior que 15%"+ ebook.getValor());
        } else{
            System.out.println("Valor do ebook com desconto:    "+ebook.getValor());
        }
    }
}
