package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	// 7) Faça um Programa que calcule a área de um quadrado, em seguida 
	// mostre o dobro desta área para o usuário.
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é: " + area + "cm²");
		System.out.println("O dobro desta area é: " + (area * 2) + "cm²");
		
		scan.close();
	}
	
	/*
	// Correção da Loiane Groner
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro da área do quadrado é: " + (area * 2));
		
		scan.close();
	}
	*/
	
}
