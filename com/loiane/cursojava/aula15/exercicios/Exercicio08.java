package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * 8) Faça um programa que pergunte o preço de três produtos e informe qual
	 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com preço do primeiro produto:");
		double produto01 = scan.nextDouble();

		System.out.println("Entre com o preço do segundo produto:");
		double produto02 = scan.nextDouble();

		System.out.println("Entre com o preço do terceiro produto:");
		double produto03 = scan.nextDouble();

		if (produto01 <= produto02 && produto01 <= produto03) {
			System.out.println("Você deve comprar o produto01: " + produto01 + " pois ele é mais barato que o "
					+ produto02 + " e o " + produto03);
		} else if (produto02 <= produto01 && produto02 <= produto03) {
			System.out.println("Você deve comprar o produto02: " + produto02 + " pois ele é mais barato que o "
					+ produto01 + " e o " + produto03);
		} else if (produto03 <= produto01 && produto03 <= produto02) {
			System.out.println("Você deve comprar o produto03: " + produto03 + " pois ele é mais barato que o "
					+ produto01 + " e o " + produto02);
		}

		scan.close();
	}
	
	 // Correção da Loiane
	/*
       public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	
	        System.out.println("Entre com o primeiro preço:");
	        double preco1 = scan.nextDouble();
	
	        System.out.println("Entre com o segundo preço:");
	        double preco2 = scan.nextDouble();
	
	        System.out.println("Entre com o terceiro preço:");
	        double preco3 = scan.nextDouble();
	
	        if (preco1 <= preco2 && preco1 <= preco3) {
	            System.out.println("Compre o produto 1");
	        } else if (preco2 <= preco1 && preco2 <= preco3) {
	            System.out.println("Compre o produto 2");
	        } else if (preco3 <= preco1 && preco3 <= preco2) {
	            System.out.println("Compre o produto 3");
	        }

       	scan.close();
   	}
	 */

}
