package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	/*
	 * 30) Desenvolva um programa que faça a tabuada de um número qualquer 
	inteiro que será digitado pelo usuário, mas a tabuada não deve 
	necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
	devem ser informados também pelo usuário, conforme exemplo abaixo: 
		o Montar a tabuada de: 5
		o Começar por: 4 
		o Terminar em: 7 
		o Vou montar a tabuada de 5 começando em 4 e terminando em 7: 
		o 5 X 4 = 20 
		o 5 X 5 = 25 
		o 5 X 6 = 30 
		o 5 X 7 = 35 
		Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número para gerar a tabuada:");
		int num = scan.nextInt();

		boolean invalido = true;
		int numInicio, numFinal;

		do {

			System.out.println("Entre com o início da tabuada");
			numInicio = scan.nextInt();

			System.out.println("Entre com final da tabuada");
			numFinal = scan.nextInt();

			if (numFinal > numInicio) {
				invalido = false;
			}

		} while (invalido);

		System.out.println("\nTabuada de " + num + ":");
		System.out.println("Começar por: " + numInicio);
		System.out.println("Terminar em: " + numFinal + "\n");

		for (int i = numInicio; i <= numFinal; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		scan.close();

	}

}
