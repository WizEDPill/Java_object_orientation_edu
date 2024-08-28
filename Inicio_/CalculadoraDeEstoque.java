package Inicio_;

public class CalculadoraDeEstoque {
    public static void main(String[] args){
    double livroJV;
    double livroTDD; 
    livroJV = 62.80;
    livroTDD= 72.40;
    double soma = livroJV+livroTDD;
    System.out.println("o valor da soma dos Livros é " + soma); 
    if (soma<100){
        System.out.println("o valor da compra esta muito baixa");
    }else{
        System.out.println("O Valor da compra foi permitido, pois passou do minimo de 101 reais.");
    }// passamos uma condiçao como argumento
    }
}
/*
double valor=0;
if(v1>v2){
valor=100;
}else{
valor=0; 
}
Pode ser escrito assim: 
double valor =v1 >v2 ? 100 :0; 
*/ 

