package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 5) Faça um programa para a leitura de duas notas parciais de um aluno.
	O programa deve calcular a média alcançada por aluno e apresentar:
	- o A mensagem "Aprovado", se a média alcançada for maior ou 
	igual a sete; 
	- o A mensagem "Reprovado", se a média for menor do que sete; 
	- o A mensagem "Aprovado com Distinção", se a média for igual a 
	dez.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma nota:");
		double nota01 = scan.nextDouble();

		System.out.println("Entre com outra nota:");
		double nota02 = scan.nextDouble();

		double media = (nota01 + nota02) / 2;

		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		System.out.println("A media final é: " + media);

		scan.close();
	}

}
