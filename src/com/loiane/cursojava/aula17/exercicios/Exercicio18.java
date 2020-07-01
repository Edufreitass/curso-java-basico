package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	/*
	 * 18) Faça um programa que peça um número inteiro e determine se ele é 
	 ou não um número primo. Um número primo é aquele que é divisível 
	 somente por ele mesmo e por 1.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número:");
		int num = scan.nextInt();

		boolean primo = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo - divisível por " + i);
				primo = false;
				// break;
			}
		}

		if (primo) {
			System.out.println("É número primo");
		}

		scan.close();
		
	}
	
}
