package mesadaGranitoTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mesadaGranito.Mesada;
import mesadaGranito.PilaMesadas;

class PilaMesadasTests {

	@Test
	void apilarMesaTest() {
		PilaMesadas stack = new PilaMesadas();
		assertTrue(stack.apilarMesada(new Mesada(1,2)));
	}
	@Test
	void noApilarMesaTest() {
		PilaMesadas stack = new PilaMesadas();
		stack.apilarMesada(new Mesada(1,2));
		assertFalse(stack.apilarMesada(new Mesada(1,3)));
	}

}
