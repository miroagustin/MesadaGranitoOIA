package mesadaGranitoTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import mesadaGranito.ApiladorMesadas;
import mesadaGranito.Mesada;
import utils.EntradaSalida;

class ApiladorMesadasTests {

	@Test
	void getCantPilasTest() {
		List<Mesada> lista = EntradaSalida.getListaMesadas();
		ApiladorMesadas ap = new ApiladorMesadas(lista);
		
	}

}
