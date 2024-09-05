package Inicio_;

public class MontaVetor {
    public static void main(String args[]){// args que estou armazenando em um array
        
        int vet[]= new int[5];
        vet[0]=1;
        vet[1]=2;
        vet[2]=3;
        vet[3]=4;
        vet[4]=5;
        int soma=0;
        for(int i=0; i<vet.length; i++ ){
        soma+=vet[i];
        System.out.println("O valor de cada vetor " +vet[i]);
        }
        System.out.println("O valor da soma e " +soma );
        
    }
}
