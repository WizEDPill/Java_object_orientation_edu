package Orieacao_objetos;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Eduardo And");
        autor.setEmail("Edu@gmail.com");
        autor.setCpf("001.234.543.11");
        
        Livro livro = new LivroFisico(autor); // Criando um objeto a partir da classe Livro
        livro.setNome("Estudo de Java");
        livro.setValor(20.50); // Usando método set para atribuir o valor
        livro.setDescricao("Aprenda Java");
        livro.setAutor(autor); // Criando a associação entre livro e autor
        livro.mostrarDetalhes(); // Invocando o método para mostrar as características do livro
        
        Autor outroAutor = new Autor();
        outroAutor.setNome("Edi");
        outroAutor.setEmail("anfer@gmail.com");
        outroAutor.setCpf("100.223.455.22");
        
        Livro outroLivro = new Ebook(outroAutor);
        outroLivro.setNome("Estude Python");
        outroLivro.setValor(23.40); // Usando método set para atribuir o valor
        outroLivro.setDescricao("Novos recursos");
        outroLivro.setAutor(outroAutor); // Criando a associação entre outro livro e outro autor
        outroLivro.mostrarDetalhes();
        //so irei manter o seter se for realmente necessario.
    }        
}
