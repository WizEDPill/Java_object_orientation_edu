package Inicio_;

import java.io.FileNotFoundException;

public class Tratativa {
    public static void main(String[] args) throws FileNotFoundException { // throws e a melhor forma de tratar disso
        abreArquivo();
    }

    private static void abreArquivo() throws FileNotFoundException{ // o throws coloca a obrigatorieadade de tratar do erro, diferente do exception tradicional
        // TODO Auto-generated method stub
        new java.io.FileInputStream("arquivo.txt");
    }
}
