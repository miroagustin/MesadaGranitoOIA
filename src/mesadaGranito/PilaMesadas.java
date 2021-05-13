package mesadaGranito;

import java.util.Stack;

public class PilaMesadas {
	private Stack<Mesada> mesadas;

	public PilaMesadas() {
		this.mesadas = new Stack<Mesada>();
	}

	public boolean apilarMesada(Mesada mesada) {
		if (!this.mesadas.isEmpty() && !this.mesadas.peek().puedeApilar(mesada))
			return false;
		
		this.mesadas.push(mesada);
		return true;
	}
}
