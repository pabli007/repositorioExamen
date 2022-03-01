import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadTest {

	//Pablo Ladron Ordoyo
	
	Utilidad utilidad = new Utilidad();
	
	@Test
	void testEjercicioD1() {
		System.out.println("cP1");
		int resultado = utilidad.ejercicioD(0);
		int esperado = 0;
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testEjercicioD2() {
		System.out.println("cP2");
		int resultado = utilidad.ejercicioD(2);
		int esperado = 4;
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testEjercicioD3() {
		System.out.println("cP3");
		int resultado = utilidad.ejercicioD(3);
		int esperado = 9;
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testEjercicioD4() {
		System.out.println("cP4");
		int resultado = utilidad.ejercicioD(4);
		int esperado = 28;
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testEjercicioD5() {
		System.out.println("cP5");
		int resultado = utilidad.ejercicioD(5);
		int esperado = 125;
		assertEquals(esperado,resultado);
	}

}
