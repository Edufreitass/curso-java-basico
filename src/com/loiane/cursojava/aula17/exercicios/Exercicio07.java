package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	// 7) Faça um programa que leia 5 números e informe o maior número. 
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Entre com 5 numeros:");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		int num5 = scan.nextInt();
//		
//		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
//			System.out.println("num1 que é igual a " + num1 + " é maior");
//		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
//			System.out.println("num2 que é igual a " + num2 + " é maior");
//		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
//			System.out.println("num3 que é igual a " + num3 + " é maior");
//		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
//			System.out.println("num4 que é igual a " + num4 + " é maior");
//		} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
//			System.out.println("num5 que é igual a " + num5 + " é maior");
//		}
//		
//		scan.close();
//	}
	
	// Correção da Loiane
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Integer
		 * MAX_VALUE	2147483647
		 * MIN_VALUE	-2147483648
		 */
		
		// variavel que vai receber o input
		int num;
		// variavel que um recebe Integer com o menor valor possível (-2147483648)
		int maior = Integer.MIN_VALUE;
//		int maior = -1;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Entre com um número:");
			num = scan.nextInt();
			
			// se o 'numero' for maior que a variavel 'maior', entao...
			if (num > maior) {
				// o valor de 'maior' sera substituido pelo numero que foi inputado
				maior = num;
				System.out.println("O número maior mudou: " + maior);
			}
			
		}
		
		System.out.println("O maior numero digitado foi: " + maior);
		
		scan.close();
	}
	
}
