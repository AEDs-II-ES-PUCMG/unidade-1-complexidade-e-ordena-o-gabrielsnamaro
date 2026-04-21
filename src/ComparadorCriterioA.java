import java.util.Comparator;

/**
 * Critério A - Valor Final do Pedido (crescente).
 * Desempate 1: Volume Total de Itens (quantProdutos).
 * Desempate 2: Código Identificador do primeiro item do pedido.
 */
public class ComparadorCriterioA implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        double comparacao1 = o1.valorFinal() - o2.valorFinal();
        int retorno;

        if(comparacao1 == 0) {
            int comparacao2 = o1.getTotalItens() - o2.getTotalItens();

            if(comparacao2 == 0) {
                retorno = o1.getIdPedido() - o2.getIdPedido();
            } else {
                retorno = comparacao2;
            }

        } else if(comparacao1 > 0) { 
            retorno = 1;
        } else {
            retorno = -1;
        } 

        return retorno;
    }
}
