package mesadaGranitoTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mesadaGranito.ApiladorMesadas;
import mesadaGranito.Mesada;
import utils.EntradaSalida;

@DisplayName("Lote de Prueba")
class ApiladorMesadasTests {

	@Test
	@DisplayName("Caso Enunciado")
	void getCantPilasTest() throws FileNotFoundException {
		List<Mesada> lista = EntradaSalida.getListaMesadas("mesadas.in");
		ApiladorMesadas ap = new ApiladorMesadas(lista);
		assertEquals(3, ap.getCantPilas());
	}

}
