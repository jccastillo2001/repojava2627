package ut1IntroProg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3NumRevesJulioTest {

	@Test
	void testImporteMenorQue100() {
	assertEquals(80.0,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(80.0),
	0.001);
	}

	@Test
	void testImporteIgualA100() {
	assertEquals(100.0,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(100.0),
	0.001);
	}

	@Test
	void testImporteMayorQue100() {
	assertEquals(140.0,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(150.0),
	0.001);
	}

	@Test
	void testImporteJustoPorEncimaDe100() {
	assertEquals(90.01,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(100.01),
	0.001);
	}

	@Test
	void testImporteConDecimales() {
	assertEquals(115.50,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(125.50),
	0.001);
	}


}
package ut1IntroProg.refuerzo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2DescuentoJulioTest {

	@Test
	void testImporteMenorQue100() {
	assertEquals(80.0,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(80.0),
	0.001);
	}

	@Test
	void testImporteIgualA100() {
	assertEquals(100.0,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(100.0),
	0.001);
	}

	@Test
	void testImporteMayorQue100() {
	assertEquals(140.0,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(150.0),
	0.001);
	}

	@Test
	void testImporteJustoPorEncimaDe100() {
	assertEquals(90.01,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(100.01),
	0.001);
	}

	@Test
	void testImporteConDecimales() {
	assertEquals(115.50,
	Ejercicio2DescuentoJulio.calcularPrecioFinal(125.50),
	0.001);
	}

}
