package Orieacao_objetos;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Livro livro =new Livro();
        System.out.print("Valor atual:  " + livro.retornarValor());
        
        if(!livro.aplicaDescontoDe(0.3)){
            System.out.println(" Desconto nao pode ser maior do que 30%.");
        } else{
            System.out.println("Valor com desconto: " + livro.retornarValor());
        }
    }

}
