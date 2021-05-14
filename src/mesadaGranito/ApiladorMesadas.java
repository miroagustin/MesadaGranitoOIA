package mesadaGranito;

import java.util.List;

public class ApiladorMesadas {

	private int cantidadPilas;

	public ApiladorMesadas(List<Mesada> listaMesadas) {
		for (Mesada mesada : listaMesadas)
			if (!mesada.esApilable(listaMesadas))
				this.cantidadPilas++;
	}

	public Integer getCantPilas() {
		return this.cantidadPilas;
	}

}
