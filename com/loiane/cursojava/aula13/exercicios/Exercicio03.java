package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	// 3) Faça um Programa que peça dois números e imprima a soma.
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("A soma dos números foi: " + (num1 + num2));
		
		scan.close();
	}
	
	/*
	// Correção da Loiane Groner
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();
		
		int resultado = num1 + num2;
		System.out.println("A soma dos números é: " + resultado);
		
		scan.close();
	}
	*/
	
}
