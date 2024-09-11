package Inicio_;

import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
        // criar um scanner para ler a entrada do usuário 
        Scanner importar = new Scanner(System.in);
        // Pede o primeiro número ao usuário
        System.out.print("Digite o primeiro número: ");
        double numero1 = importar.nextDouble();

        // Pede o segundo número ao usuário
        System.out.print("Digite o segundo número: ");
        double numero2 = importar.nextDouble();

        // Calcula a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe o resultado da soma
        System.out.println("a soma é : " +soma);
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);

        //é preciso fechar o scaner
        importar.close();

    }
}
