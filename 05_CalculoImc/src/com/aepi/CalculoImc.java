package com.aepi;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {

		String nombre;
		int edad;
		double peso;
		double altura;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n¡HOLA! BIENVENIDO A LA CALCULADORA DE IMC. \n\n¿Cómo te llamas?");
		nombre = scanner.next();
		System.out.println("\n" + nombre + ", debes ser mayor de edad para utilizar esta app. ¿Cuántos años tienes?");
		edad = scanner.nextInt();
		System.out.println("\n¡Genial, " + nombre + "! Ahora dime cuanto pesas, por favor.");
		peso = scanner.nextDouble();
		System.out.println("\nPerfecto " + nombre + ", ya estamos terminando. Una última pregunta, ¿Cuánto mides en metros?");
		altura = scanner.nextDouble();
		
		CalcularIMC calcularImc = new CalcularIMC(nombre, edad, peso, altura);
		System.out.println(calcularImc.comparar());

	}

}

class CalcularIMC {

	String nombre;
	int edad;
	double peso, altura;

	public CalcularIMC() {

	}

	public CalcularIMC(String nombre, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public String comparar() {

		double valor = this.peso / (this.altura * this.altura);
		String respuestaImc = "";

		if (valor < 16.00) {

			respuestaImc = "\n" + nombre + " tu IMC muestra que tienes delgadez extrema.";

		} else if (valor <= 16.00 || valor <= 16.99) {

			respuestaImc = "\n" + nombre + " tu IMC muestra que tienes delgadez moderada.";

		} else if (valor <= 17.00 || valor <= 18.49) {

			respuestaImc = "\n" + nombre + " tu IMC muestra que tienes delgadez aceptable.";

		} else if (valor <= 18.50 || valor <= 24.99) {

			respuestaImc = "\n" + nombre + " tu IMC muestra que estas en tu peso.";

		} else if (valor <= 25.00 || valor <= 29.99) {

			respuestaImc = "\n" + nombre + " tu IMC muestra que tienes sobrepeso.";

		} else if (valor <= 30.00 || valor <= 34.99) {

			respuestaImc = "\n" + nombre + " tu IMC muestra que tienes obesidad de tipo I.";

		} else if (valor <= 35.00 || valor <= 40.00) {

			respuestaImc = "\n" + nombre + " tu IMC muestra que tienes tienes obesidad de tipo III.";

		} else {

			respuestaImc = "\nMírate en un espejo, si no tienes reflejo estás muerto";

		}

		return respuestaImc;

	}

}