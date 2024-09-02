package Orieacao_objetos;

/*public class CarrinhoDeCompras {
    public void adiciona(LivroFisico livro){
        System.out.println("Adicionado: " + livro);
    }
    public void adiciona(Ebook livro){
        System.out.println("Adicionado: " +livro);
    }
}*/
//Polimorfismo ->
public class CarrinhoDeCompras {
    private double total;
    public void adiciona(Livro livro){
        System.out.println("Adicionando:    "+ livro);
        livro.aplicaDescontoDe(.05);
        total += livro.getValor();
    }
    public void adiciona(Revista revista){
        System.out.println("Adicionando:    "+revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }
    public double getTotal(){
        return total; // quando fizer o get total vai retornar o total
    }
}
