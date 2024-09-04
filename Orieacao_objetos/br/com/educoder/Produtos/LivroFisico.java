package Orieacao_objetos.br.com.educoder.Produtos;
import Orieacao_objetos.br.com.educoder.livraria.Autor;
// aqui eu criei uma regra diferente pra livro fisico, pois ele apresenta taxa de impressao. 
public class LivroFisico extends Livro implements Promocional{ // como extende de Livro a classe LivroFisico vai herdar os atributos do Livro
    public LivroFisico(Autor autor){
            super(autor);
        }
        public double getTaxaImpressao(){
            return this.getValor()*0.05; // nem sempre preciso do set para atribuir esse novo valor
        }
        public boolean aplicaDescontoDe(double porcentagem){
            if (porcentagem>0.3){
                return false;
            }//seria tipo um else
            double desconto =getValor()*porcentagem;
            setValor(getValor()-desconto);
            System.out.println("Aplicado desconto no Livro Fisico");
            return true;
            }

        }
    
    
