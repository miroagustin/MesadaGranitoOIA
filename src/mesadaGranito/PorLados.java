package mesadaGranito;

import java.util.Comparator;

public class PorLados implements Comparator<Mesada> {

	@Override
	public int compare(Mesada o1, Mesada o2) {
		int comparacion = Integer.compare(o1.getLado1(), o2.getLado2());
		if(comparacion == 0)
			comparacion = Integer.compare(o1.getLado2(), o2.getLado2());
		return -comparacion;
	}

}
