package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	Calculadora calc = new Calculadora();

	@Test
	void testSum() {
		int suma = calc.sum(2, 5);
		int tot = 7;

		System.out.println("@Test sumar(): " + suma + " = " + tot);
		assertEquals(suma, tot);

		int suma2 = calc.sum(1, 1);
		int tot2 = 42;

//		System.out.println("@Test sumar(): " + suma2 + " = " + tot2);
//		assertEquals(suma2, tot2);

	}

	@Test
	void testRes() {
		int resta = calc.sum(2, 5);
		int tot = 7;

		System.out.println("@Test sumar(): " + resta + " = " + tot);
		assertEquals(resta, tot);

		int resta2 = calc.res(1, 1);
		int tot2 = 42;

//		System.out.println("@Test sumar(): " + resta2 + " = " + tot2);
//		assertEquals(resta2, tot2);
	}

}
