package com.loiane.cursojava.aula13.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {

	// 4) Faça um Programa que peça as 4 notas bimestrais e mostre a média.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Digite as 4 notas bimestrais: ");
			double nota01 = scan.nextDouble();
			double nota02 = scan.nextDouble();
			double nota03 = scan.nextDouble();
			double nota04 = scan.nextDouble();
			double mediaFinal = (nota01 + nota02 + nota03 + nota04) / 4;
			System.out.println("A sua média final é " + mediaFinal);
		} catch (InputMismatchException e) {
			System.out.println("Caractere inválido");
			e.printStackTrace();
		}

		scan.close();
	}
	
	/*
	// Correção da Loiane Groner
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Entre com a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Entre com a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média é: " + media);
		
		scan.close();
	}
	*/

}
