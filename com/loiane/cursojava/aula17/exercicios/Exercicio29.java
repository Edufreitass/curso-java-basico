package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio29 {

	/*
	 * 29) Encontrar números primos é uma tarefa difícil. Faça um programa que
	gera uma lista dos números primos existentes entre 1 e um número 
	inteiro informado pelo usuário. 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		boolean primo;

		for (int i = 1; i <= num; i++) {

			primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}

			if (primo) {
				System.out.println(i);
			}
		}

		scan.close();
		
	}

}
