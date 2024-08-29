package Orieacao_objetos;


public class Livro {
    private double valor; // deixei o valor como privado da classe livro
    private String nome; 
    private String descricao;
    private Autor autor; // uma classe pode ter outra classe como atributo -> chama-se COMPOSIÇÃO
        //aqui eu crio de forma menos poluida um metodo para mostrar menssagem de cada livro com suas caracteristicas, sem ter que ficar repetindo em cada objeto
    //DEMAIS METODOS OMITIDOS 
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
        this.autor=autor;
    }
    public Livro(){
        //seters, getters e outros metodos
    }
    


    void mostrarDetalhes(){
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

}

        //ATE PAGINA 55 DO LIVRO


//posso isolar um comportamento dentro de um metodo. 
// vamos criar um metodo aplicaDesconto que recebe um valor como parâmetro

