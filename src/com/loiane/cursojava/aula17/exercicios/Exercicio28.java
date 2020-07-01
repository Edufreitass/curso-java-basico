package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio28 {

	/*
	 * 28) Os números primos possuem várias aplicações dentro da 
	Computação, por exemplo na Criptografia. Um número primo é aquele
	que é divisível apenas por um e por ele mesmo. Faça um programa que
	peça um número inteiro e determine se ele é ou não um número primo.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		boolean primo = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo - divisível por " + i);
				primo = false;
			}
		}

		if (primo) {
			System.out.println("É número primo");
		}

		scan.close();
		
	}

}
