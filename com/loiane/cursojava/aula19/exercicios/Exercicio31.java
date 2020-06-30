package com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio31 {

	/*
	 * 31) Ler um vetor A com 20 elementos. Separar os elementos pares e 
	ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
	do vetor B armazene os elementos pares de A e nas posições 
	restantes do vetor B armazene os elementos de A que são ímpares. 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; // pares e impares

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição A - " + i);
			vetorA[i] = scan.nextInt();
		}

		int posB = 0;

		// pares
		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}

		}

		// impares
		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}

		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < posB; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();

		scan.close();

	}

}
