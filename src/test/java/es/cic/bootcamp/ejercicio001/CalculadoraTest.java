package es.cic.bootcamp.ejercicio001;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora();
		
		int a = 4;
		int s2 = 5;
		int resultado = calculadora.sumar(a, s2);
		
		assertEquals(9, resultado, "La suma no es correcta");
	}

}
