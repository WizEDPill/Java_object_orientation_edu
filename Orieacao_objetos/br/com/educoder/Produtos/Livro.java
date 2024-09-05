package Orieacao_objetos.br.com.educoder.Produtos;
import Orieacao_objetos.br.com.educoder.livraria.Autor;
import Orieacao_objetos.br.com.educoder.livraria.AutorNuloException;


public abstract class Livro implements Produto { // por ser uma class abstract ela so serve para heranca e polimorfismo
    private double valor; // deixei o valor como protect para seu usado, pois sera um meio termo entre private e public vai ser visivel a classes filhas
    private String nome; 
    private String descricao;
    public Autor autor; // uma classe pode ter outra classe como atributo -> chama-se COMPOSIÇÃO
        //aqui eu crio de forma menos poluida um metodo para mostrar menssagem de cada livro com suas caracteristicas, sem ter que ficar repetindo em cada objeto
    //DEMAIS METODOS OMITIDOS 
    private boolean impresso;
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){// curisidade: void é utilizado para representar uma função que não retorna nada ou também não recebe nada.
        this.valor=valor;
    }
    public String getNome(){
        return nome;
    }// get busca set recebe o valor que e o mesmo da atribuicao
    public void setNome(String nome){ // definir o nome e primordial
        this.nome = nome; 
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public Autor getAutor(){// do tipo autor que eu peguei de outra pasta
        return autor;
    }
    public void setAutor(Autor autor){
        this.autor= autor;
    }
    public Livro(Autor autor){ // ficou com a resposnsabilidade do metodo setAutor
        if(autor ==null){
            throw new AutorNuloException(
                "O Autor do livro nao pode ser nulo"
            );
        }
        this.autor=autor;
        this.impresso=true;
    }
    public Livro(){
        //seters, getters e outros metodos
    }
    public abstract boolean aplicaDescontoDe(double procentagem);
    public void mostrarDetalhes(){
        System.out.println("detalhes do Livro: "+ nome);
        System.out.println("Nome: "+nome);
        System.out.println("Valor: " +valor);
        System.out.println("Descricao: "+descricao);
        //if (this.temAutor()) { // Verifica se o autor foi associado antes de tentar acessar seus detalhes (vai verificar se tem autor ne nao vair terornar nada)
        autor.mostrarDetalhes();
            
        System.out.println("-----------------------------");
            }
        void adicionarValor(double valor){
            this.valor=valor;
        }
        double retornarValor(){
            return this.valor;
        }
        public boolean isImpresso() {
            return impresso;
        }
        public void setImpresso(boolean impresso) {
            this.impresso = impresso;
        }
       
        
}

    
    


    



        //ATE PAGINA 55 DO LIVRO


//posso isolar um comportamento dentro de um metodo. 
// vamos criar um metodo aplicaDesconto que recebe um valor como parâmetro

