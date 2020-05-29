package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9) Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
	 * mostre a temperatura em graus Celsius. 
	 * - Fórmula: C = 5 * (F-32) / 9
	 */
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em °F: ");
		double fahrenheit = scan.nextDouble();
		
		double celsius = 5 * (fahrenheit - 32) / 9;
		
		System.out.println("A temperatura " + fahrenheit + " °F é igual a " + celsius + " °C");
		
		scan.close();
	}
	
	/*
	// Correção da Loiane Groner
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Fahrenheit: ");
		double f = scan.nextDouble();
		
		double c = (5 * (f - 32) / 9);
		
		System.out.println("A temperatura " + f + " °F é igual a " + c + " °C");
		
		scan.close();
	}
	*/
	
}
