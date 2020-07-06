package com.loiane.cursojava.aula34.exercicios.ex03;

import java.util.Scanner;

public class TestaCalculadoraFatorial {

	/*
	 * 3) Escreva um método para calcular factorial de um número na classe.
	 * Calculadora do exercício anterior.
	 */
	public static void main(String[] args) {

		imprimirValor(CalculadoraFatorial.somar(1, 1));
		imprimirValor(CalculadoraFatorial.subtrair(10, 2));
		imprimirValor(CalculadoraFatorial.multiplicar(5, 5));
		imprimirValor(CalculadoraFatorial.dividir(8, 2));
		imprimirValor(CalculadoraFatorial.potencia(2, 4));

		// Fatorial
		System.out.println("Calculando Fatorial");

		Scanner scan = new Scanner(System.in);

		int num;

		do {
			System.out.println("Entre com um número positivo");
			num = scan.nextInt();

			if (num < 0) {
				System.out.println("Número inválido, entre novamente!");
			}

		} while (num < 0);

		imprimirValor(CalculadoraFatorial.fatorial(num));

		scan.close();

	}

	public static void imprimirValor(int num) {
		System.out.println(num);
	}

}
