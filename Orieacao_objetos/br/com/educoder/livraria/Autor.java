package Orieacao_objetos.br.com.educoder.livraria;

public class Autor {
    String nome;
    String email;
    String cpf;
    public Autor() {// Construtor vazio para permitir a criação de objetos sem argumentos no caso para conseguir preencher os dados em cadastroLivros tenho que deixar essa caixa vasia
        //TODO Auto-generated constructor stub
    }
    //metodos 
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getEmail(){
        return email; 
    }
    public void setEmail(String email){
        this.email=email; 
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public void mostrarDetalhes(){
    System.out.println("Autor do livro: ");
    System.out.println("nome: " +nome);
    System.out.println("Email: " +email);
    System.out.println("CPF"+ cpf);
    //deixei public para todos acessarem
    }
}
