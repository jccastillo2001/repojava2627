package ut1IntroProg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1RegaloJulioTest {

	@Test
	void testNumeroCincoCifras() {
	assertEquals("54321",
	Ejercicio3NumRevesJulio.invertirNumero(12345));
	}
	@Test
	void testNumeroCincoCifrasConCeros() {
	assertEquals("00120",
	Ejercicio3NumRevesJulio.invertirNumero(2100));
	}
	
	@Test
	void testNumeroCuatroCifras() {
	assertEquals("43210",
	Ejercicio3NumRevesJulio.invertirNumero(1234));
	}
	
	@Test
	void testNumeroTresCifras() {
	assertEquals("32100",
	Ejercicio3NumRevesJulio.invertirNumero(123));
	}
	
	@Test
	void testNumeroDosCifras() {
	assertEquals("21000",
	Ejercicio3NumRevesJulio.invertirNumero(12));
	}
	
	@Test
	void testNumeroUnaCifra() {
	assertEquals("10000",
	Ejercicio3NumRevesJulio.invertirNumero(1));
	}
	
	@Test
	void testNumeroMaximo() {
	assertEquals("99999",
	Ejercicio3NumRevesJulio.invertirNumero(99999));
	}
	
	@Test
	void testNumeroCero() {
	assertEquals("00000",
	Ejercicio3NumRevesJulio.invertirNumero(0));
	}

}
