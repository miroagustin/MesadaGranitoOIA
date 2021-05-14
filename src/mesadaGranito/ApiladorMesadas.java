package mesadaGranito;

import java.util.LinkedList;
import java.util.List;

public class ApiladorMesadas {

	private List<Mesada> pilas;

	public ApiladorMesadas(List<Mesada> listaMesadas) {
		this.pilas = new LinkedList<Mesada>();
		listaMesadas.sort(new PorLados());
		for (Mesada mesada : listaMesadas)
			if (!mesada.esApilable(listaMesadas))
				this.pilas.add(mesada);
	}

	public Integer getCantPilas() {
		return this.pilas.size();
	}

}
