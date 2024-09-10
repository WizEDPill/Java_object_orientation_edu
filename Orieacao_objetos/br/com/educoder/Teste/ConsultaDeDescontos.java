public class ConsultaDeDescontos {
    public static void main(String[] args){
        GerenciadorDeCupons gerenciador= new GerenciadorDeCupons();
        
        if(gerenciador.validaCupom("cab10")){
            double desconto = gerenciador.ConfirmaCupom("cab10");
            System.out.println("Cupom valido ");
            System.out.println("Valor: R$"+ desconto+"0");
        }else{
            System.out.println("Cupom invalido");
        }
        //Agora, a classe ConsultaDeDescontos cria uma instância de GerenciadorDeCupons e usa os métodos validaCupom e ConfirmaCupom corretamente. 
        //Isso deve resolver os problemas de compilação e funcionamento do seu código.
        
    }
}
