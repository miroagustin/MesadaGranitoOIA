package mesadaGranito;

import java.util.LinkedList;
import java.util.List;

public class ApiladorMesadas {

	private int cantidadPilas;
	private List<Mesada> mesadas = new LinkedList<Mesada>();

	public void agregar(Mesada mesada) {
		mesadas.add(mesada);
	}

	public void resolver() {
		for (Mesada mesada : mesadas)
			if (!mesada.esApilable(mesadas))
				this.cantidadPilas++;
	}

	public Integer getResultado() {
		return this.cantidadPilas;
	}

}
