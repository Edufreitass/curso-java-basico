package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	// 18) Faça um Programa que peça um número inteiro e determine se ele é
	// par ou impar. Dica: utilize o operador módulo (resto da divisão).
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num = scan.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " é par");
		else
			System.out.println(num + " é impar");

		scan.close();
	}

}
