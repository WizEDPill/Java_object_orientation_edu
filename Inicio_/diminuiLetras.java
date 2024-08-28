package Inicio_;

import javax.swing.JOptionPane;
public class diminuiLetras {
    public static void lowCase() throws NullPointerException {
        try{
        String word= null; 
        String newWord= null; 
        word=JOptionPane.showInputDialog(null,"informe uma palavra");
        newWord= word.toLowerCase();
        System.out.println(" A palavra Informa é: "+word);
        System.out.println("A palavra Corrigida é :"+newWord);
        } catch(NullPointerException ex){
            System.err.println(" Esta tentando usar um objeto null");
        }
        }
    public static void main(String[] args) {
        lowCase(); // Chama o método para testar
    }
}

