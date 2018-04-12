package Examen_UF2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTestTest {


	@Test
	public void testresidu() {
		assertTrue(CalculadoraTest.residu(20));

	}
	@Test
	public void testpotencia() {
		int resultat = CalculadoraTest.potencia(5, 5);
		System.out.println(resultat);
		
		assertEquals(9, resultat);
	}
}
