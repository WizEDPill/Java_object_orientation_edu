package Orieacao_objetos;


public class Livro {
        String nome; 
        Double valor;
        String descricao;
        Autor autor; // uma classe pode ter outra classe como atributo -> chama-se COMPOSIÇÃO
        //aqui eu crio de forma menos poluida um metodo para mostrar menssagem de cada livro com suas caracteristicas, sem ter que ficar repetindo em cada objeto
        void mostrarDetalhes(){
            System.out.println("detalhes do Livro: "+ nome);
            System.out.println("Nome: "+nome);
            System.out.println("Valor: " +valor);
            System.out.println("Descricao: "+descricao);
            if (autor != null) { // Verifica se o autor foi associado antes de tentar acessar seus detalhes
                autor.mostrarDetalhes();
            }
            System.out.println("-----------------------------");
        }
        public static void main(String[] args) {
            Autor autor= new Autor();
            autor.nome= "Eduardo Andrade";
            autor.email="edu@gmail.com";
            autor.cpf="006.233.456.11";
 
            Livro livro= new Livro();//criando um objeto apartir da classe livro
            livro.nome="Estude Java";
            livro.valor=20.50;
            livro.descricao="novos recursos";
            livro.autor=autor; //criei o autor para o livro (linkei ele)
            livro.mostrarDetalhes(); //invoco o metodo de mostrar as caracteristicas do livro
            //exibindo as informações do livro( de forma pouluida)
           /* 
           System.out.println("Nome: "+livro.nome);
            System.out.println("Valor: " +livro.valor);
            System.out.println("Descricao: "+livro.descricao);
            */ 
            Autor outroAutor= new Autor();
            outroAutor.nome= "Edu Andrade";
            outroAutor.email="anfer@gmail.com";
            outroAutor.cpf="006.223.456.11";

            Livro OutroLivro = new Livro();
            OutroLivro.nome="Estude Python";
            OutroLivro.valor=23.40;
            OutroLivro.descricao="novos recursos";
            OutroLivro.autor= outroAutor; //criei o outro autor para o livro (linkei ele)
            OutroLivro.mostrarDetalhes();
            
        }
       
        //ATE PAGINA 55 DO LIVRO
       
    }

