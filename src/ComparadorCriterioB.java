import java.util.Comparator;

/**
 * Critério B - Volume Total de Itens (crescente).
 * Desempate 1: Data do Pedido.
 * Desempate 2: Código Identificador do pedido.
 */
public class ComparadorCriterioB implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        int comparacao1 = o2.getFormaDePagamento() - o1.getFormaDePagamento();
        int retorno;

        if(comparacao1 == 0) {
            double comparacao2 = o1.valorFinal() - o2.valorFinal();

            if(comparacao2 == 0) {
                retorno = o1.getIdPedido() - o2.getIdPedido();
            } else if(comparacao2 > 0) {
                retorno = 1;
            } else {
                retorno = -1;
            }

        } else if(comparacao1 > 0) { 
            retorno = 1;
        } else {
            retorno = -1;
        } 

        return retorno;
    }
}
