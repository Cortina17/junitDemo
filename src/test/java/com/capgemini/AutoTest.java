package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutoTest {

	@Test
	void testAuto() {
		fail("Not yet implemented");
	}

	@Test
	void testImprimirInfo() {
		Auto miAuto = new Auto("Ferrari", "Amarillo", 3.0);
		String actual = miAuto.getColor();
		String expected = new String(actual);
		assertEquals(expected, miAuto.getColor());
		System.out.println(expected);
	}

	@Test
	void testSubirPotenciaMotor() {
		Auto miAuto = new Auto("Audi", "Rojo", 1.6);
		miAuto.subirPotenciaMotor(0.1);
		double expected = miAuto.getMotor();
		fail("Not yet implemented");
	}

}
