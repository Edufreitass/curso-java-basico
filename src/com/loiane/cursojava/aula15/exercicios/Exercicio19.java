package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	/*
	19) Faça um Programa que leia 2 números e em seguida pergunte ao 
	usuário qual operação ele deseja realizar. O resultado da operação 
	deve ser acompanhado de uma frase que diga se o número é: 
	    . par ou ímpar; 
	    a. positivo ou negativo; 
	 */
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();

		System.out.println("Qual operação voce desejar usar ( + - * / ):");
		String operacao = scan.next();

		double resultado = 0;
		// valida ou não a segunda operação que vai dizer se o numero é pos ou neg
		boolean valida = true;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operação inválida!");
			valida = false;
		}

		if (valida) {

			if (resultado % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}

			if (resultado >= 0) {
				System.out.println("POSITIVO");
			} else if (resultado == 0) {
				System.out.println("DEU ZERO");
			} else {
				System.out.println("NEGATIVO");
			}

		}

		scan.close();
	}

}
