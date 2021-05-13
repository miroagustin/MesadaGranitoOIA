package mesadaGranito;

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

}
