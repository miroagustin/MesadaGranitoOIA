package mesadaGranito;

import java.util.List;

public class Mesada {

	private int lado1;
	private int lado2;

	public Mesada(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public boolean puedeApilar(Mesada other) {
		if(this.lado1 < other.lado1)
			return false;
		if(this.lado2 < other.lado2)
			return false;
		return true;
	}
	
	public boolean esApilable(List<Mesada> lista) {
		for(Mesada mesada : lista) {
			if((this.lado1 < mesada.lado1 && this.lado2 < mesada.lado2)
					|| (this.lado2 < mesada.lado1 && this.lado1 < mesada.lado2)) {
				return true;
			}
		}
		return false;
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

}
