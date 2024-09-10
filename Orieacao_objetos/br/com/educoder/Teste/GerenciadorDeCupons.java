
import java.util.HashMap;
import java.util.Map;
public class GerenciadorDeCupons {
    private Map<String, Double> cupons; // vou criar uma lista de descontos
    public GerenciadorDeCupons(){
        this.cupons= new HashMap<>();
        cupons.put("cab22", 11.0);
        cupons.put("cab10",12.00);
        cupons.put("cab12", 13.00);
        
    }
    public Boolean validaCupom(String cupom){
        return this.cupons.containsKey(cupom); // metodo containsKey para verificar se o cupom passado existe.
        // o método containsValue poderia ser usado para verificar a existencia de alguns valores. 

    }
    public Double ConfirmaCupom(String cupom){
        return this.cupons.get(cupom);
    }
   
}
