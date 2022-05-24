package com.capgemini;

public class Calculadora {

	public int sum(int var1, int var2) {
		System.out.println("Sumando..." + var1 + " + " + var2 + " = " + (var1+var2));
		return var1+var2;
	}
	
	public int res(int var1, int var2) {
		System.out.println("Restando..." + var1 + " + " + var2 + " = " + (var1+var2));
		return var1-var2;
	}
}
