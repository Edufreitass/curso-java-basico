package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	// 6) Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = 3.14 * Math.pow(raio, 2);
//		double area = 3.14 * raio * raio;
		
		System.out.println("A area do circulo é: " + area);
		
		scan.close();
	}
	
	/* 
	// Correção da Loiane Groner
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area); 
		
		scan.close();
	}
	*/

}
