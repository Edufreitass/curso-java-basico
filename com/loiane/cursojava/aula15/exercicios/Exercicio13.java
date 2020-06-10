package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	/*
	 * 13) Faça um Programa que leia um número e exiba o dia correspondente
	 * da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
	 * aparecer valor inválido.
	*/
	public static void main(String... args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um N° correspondente ao dia da semana:\n"
									  + "1 - Domingo,\n"
									  + "2 - Segunda,\n"
									  + "3 - Terça,\n"
									  + "4 - Quarta,\n"
									  + "5 - Quinta,\n"
									  + "6 - Sexta,\n"
									  + "7 - Sábado");
		System.out.println("------------------------------------------------");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
		
		scan.close();
	}
	
}
