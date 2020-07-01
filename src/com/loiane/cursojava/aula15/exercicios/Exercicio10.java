package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	/*
	10) Faça um Programa que pergunte em que turno você estuda. Peça
	para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
	mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
	Inválido!", conforme o caso.
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Em que turno você estuda?\n"
							+ "Digite:\n"
							+ " M - Matutino,\n"
							+ " V - Vespertino,\n"
							+ " N - Noturno\n");
		String turno = scan.next();
		
		switch (turno) {
		case "m":
		case "M":
			System.out.println("Bom Dia!");
			break;
		case "v":
		case "V":
			System.out.println("Boa Tarde!");
			break;
		case "n":
		case "N":
			System.out.println("Boa Noite!");
			break;
		default:
			System.out.println("Valor Inválido!");
			break;
		}
		
		scan.close();

	}

}
