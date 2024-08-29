package Orieacao_objetos;

public class Autor {
    String nome;
    String email;
    String cpf;
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
    void mostrarDetalhes(){
    System.out.println("Autor do livro: ");
    System.out.println("nome: " +nome);
    System.out.println("Email: " +email);
    System.out.println("CPF"+ cpf);
    }
}
