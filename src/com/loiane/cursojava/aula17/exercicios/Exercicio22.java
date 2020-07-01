package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	/*
	 * 22) Faça um programa que calcule o valor total investido por um 
	 colecionador em sua coleção de CDs e o valor médio gasto em cada 
	 um deles. O usuário deverá informar a quantidade de CDs e o valor 
	 para em cada um. 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a qtd de CDs:");
		int qtdCds = scan.nextInt();
		
		double preco;
		double soma = 0;
		
		for (int i = 1; i <= qtdCds; i ++) {
			
			System.out.println("Informe o valor do CD " + i);
			preco = scan.nextDouble();
			
			soma += preco;
			
		}
		
		double media = soma / qtdCds;
		
		System.out.println("Média gasta com cada CD: " + media);
		
		scan.close();
		
	}
	
}
