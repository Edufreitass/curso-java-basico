package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	/*
	 * 13) Faça um programa que peça dois números, base e expoente, calcule e 
	 mostre o primeiro número elevado ao segundo número. Não utilize a 
	 função de potência da linguagem. 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com base:");
		int base = scan.nextInt();

		System.out.println("Entre com a potência:");
		int potencia = scan.nextInt();
		
		// 2 ^ 2 = 2 * 2
		// 2 ^ 3 = 2 * 2 * 2

		int resultado = base;

		for (int i = 1; i < potencia; i++) {
			resultado *= base;
		}

		System.out.println("A base " + base + " elevada a potência " + potencia + " é igual a " + resultado);

		scan.close();
	}

}
