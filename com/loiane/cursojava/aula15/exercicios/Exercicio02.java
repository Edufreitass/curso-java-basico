package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	// Faça um Programa que peça um valor e mostre na tela se o valor
	// é positivo ou negativo.
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero:");
		int num = scan.nextInt();

		if (num >= 0) {
			System.out.println("O número informado é positivo");
		} else {
			System.out.println("O número informado é negativo");
		}

		scan.close();
	}

}
