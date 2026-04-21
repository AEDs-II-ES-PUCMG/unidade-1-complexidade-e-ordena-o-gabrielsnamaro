import java.util.Comparator;

/**
 * Critério C - Índice de Economia (decrescente).
 * O índice de economia é a diferença entre o valor de catálogo atual e o valor efetivamente pago.
 * Desempate 1: Valor Final do Pedido (crescente).
 * Desempate 2: Código Identificador do pedido (crescente).
 */
public class ComparadorCriterioC implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        double mediaO1 = o1.valorFinal() / o1.getQuantosProdutos();
        double mediaO2 = o2.valorFinal() / o2.getQuantosProdutos();

        double comparacao1 = mediaO1 - mediaO2;
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
