package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * 5) Altere o programa anterior permitindo ao usuário informar as 
	 populações e as taxas de crescimento iniciais. Valide a entrada e 
	 permita repetir a operação. 
	 */
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		// flag
		boolean validador = false;
		
		double popA;
		double popB;
		double taxaPopA;
		double taxaPopB;

		do {

			System.out.println("Entre com a população A:");
			popA = scan.nextDouble();

			if (popA > 0) {
				validador = true;
			} else {
				System.out.println("popA precisa ser maior que 0.");
			}

		} while (!validador);

		do {

			System.out.println("Entre com a população do pais B:");
			popB = scan.nextDouble();

			if (popB > 0) {
				validador = true;
			} else {
				System.out.println("popB precisa ser maior que 0.");
			}

		} while (!validador);

		do {

			System.out.println("Entre com a taxa de crescimento da popA:");
			taxaPopA = scan.nextDouble();

			if (taxaPopA > 0) {
				validador = true;
			} else {
				System.out.println("Taxa de crescimento precisa ser maior que 0.");
			}

		} while (!validador);

		do {

			System.out.println("Entre com a taxa de crescimento da popB:");
			taxaPopB = scan.nextDouble();

			if (taxaPopB > 0) {
				validador = true;
			} else {
				System.out.println("Taxa de crescimento precisa ser maior que 0.");
			}

		} while (!validador);

		int cont = 0;

		while (popA < popB) {

			popA += (popA / 100) * taxaPopA;
			popB += (popB / 100) * taxaPopB;
			cont++;

		}

		System.out.println("População A: " + popA);
		System.out.println("Taxa de crescimento da popA é " + taxaPopA);
		System.out.println("População B: " + popB);
		System.out.println("Taxa de crescimento da popA é " + taxaPopB);
		System.out.println("Qtd anos: " + cont);

		scan.close();
	}

}
