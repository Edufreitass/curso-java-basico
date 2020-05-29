package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	// 5) Faça um Programa que converta metros para centímetros. 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		// 1m = 100cm
		double centimetros = metros * 100;
		
		System.out.println(metros + " m é igual a " + centimetros + " cm");
		
		scan.close();
	}
	
	/*
	// Correção da Loiane Groner
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros: ");
		double metros = scan.nextDouble();

		// 1m = 100 cm
		double cm = metros * 100;
		
		System.out.println(metros + " m é igual a " + cm + " cm");
		
		scan.close();
	}
	*/
	
}
