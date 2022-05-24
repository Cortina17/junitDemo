package com.capgemini;

public class Auto {

	String marca = "Toyota";
	String color = "Gris";
	double motor = 2.0;

	public Auto(String marca, String color, double motor) {
		this.marca = marca;
		this.color = color;
		this.motor = motor;

	}
	
	public void imprimirInfo(String marca, String color, double motor) {
		System.out.println("El auto marca: " + this.marca + " es de color: " + " y tiene una potencia de motor: " + this.motor);
	}
	
	public void subirPotenciaMotor(double potencia) {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

}
