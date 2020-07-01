package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	// 3) Faça um Programa que verifique se uma letra digitada é "F" ou "M".
	// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra (F ou M):");
		String input = scan.next();

		// equalsIgnoreCase: ignora os casos de letra MAiUSCULA ou minuscula
		if (input.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else if (input.equalsIgnoreCase("M")) {
			System.out.println(("M - Masculino"));
		} else {
			System.out.println("Sexo inválido");
		}

		scan.close();
	}

}
