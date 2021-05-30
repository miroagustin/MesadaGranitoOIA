package mesadaGranitoTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mesadaGranito.ApiladorMesadas;
import utils.EntradaSalida;

@DisplayName("Lote de Prueba")
class ApiladorMesadasTests {

	@Test
	@DisplayName("Caso Enunciado")
	void getCantPilasTest() throws FileNotFoundException {
		ApiladorMesadas ap = EntradaSalida.escribir("mesadas.in");
		ap.resolver();
		assertEquals(3, ap.getResultado());
	}

}
