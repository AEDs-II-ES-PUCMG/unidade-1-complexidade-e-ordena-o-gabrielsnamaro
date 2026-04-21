import java.util.Comparator;

public class ComparadorPorValor implements Comparator<Pedido>{

	@Override
	public int compare(Pedido o1, Pedido o2) {
		double comparacao = o1.valorFinal() - o2.valorFinal();

		if(comparacao == 0)
			return 0;
		else if(comparacao > 0)
			return 1;
		else
			return -1;
	}
}
