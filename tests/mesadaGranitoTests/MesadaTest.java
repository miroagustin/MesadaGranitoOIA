package mesadaGranitoTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mesadaGranito.Mesada;

class MesadaTest {

	@Test
	void testNoPuedeApilar() {
		Mesada m1 = new Mesada(1,4);
		Mesada m2 = new Mesada(2,4);
		assertFalse(m1.puedeApilar(m2));
	}
	@Test
	void testPuedeApilar() {
		Mesada m1 = new Mesada(4,4);
		Mesada m2 = new Mesada(2,4);
		assertTrue(m1.puedeApilar(m2));
	}
}
