package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	/*
	 * 21) Faça um programa que calcule o número médio de alunos por turma. 
	 Para isto, peça a quantidade de turmas e a quantidade de alunos para 
	 cada turma. As turmas não podem ter mais de 40 alunos. 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número de turmas:");
		int numTurmas = scan.nextInt();

		int numAlunos;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i <= numTurmas; i++) {

			invalido = true;

			do {

				System.out.println("Entre com o número de alunos da turma " + i);
				numAlunos = scan.nextInt();

				if (numAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Número de alunos inválidos. Digite novamente.");
				}

			} while (invalido);

			soma += numAlunos;

		}

		double media = soma / numTurmas;

		System.out.println("Média: " + media);

		scan.close();
		
	}

}
