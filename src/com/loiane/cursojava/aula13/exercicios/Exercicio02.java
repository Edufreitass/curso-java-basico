package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	// 2) Faça um Programa que peça um número e então mostre a mensagem. 
	// O número informado foi [número].
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi: " + numero);
		
		scan.close();
	}
	
}
