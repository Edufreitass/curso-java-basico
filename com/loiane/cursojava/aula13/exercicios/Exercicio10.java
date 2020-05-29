package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	/*
	 * 10) Faça um Programa que peça a temperatura em graus Celsius, transforme e
	 * mostre em graus Farenheit.
	 * - Fórmula: F = (C * 1.8) + 32
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em °C: ");
		double celsius = scan.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("A temperatura " + celsius + " °C é igual a " + fahrenheit + " °F");
		
		scan.close();
	}
	
	/* 
	// Correção da Loiane Groner
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Celsius: ");
		double c = scan.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A temperatura " + c + " °C é igual a " + f + " °F");
		
		scan.close();
		
	}
	*/
	
}
