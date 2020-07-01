package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	/*
	21) Um posto está vendendo combustíveis com a seguinte tabela de 
	descontos: 
	    . Álcool: 
	    a. até 20 litros, desconto de 3% por litro 
	    b. acima de 20 litros, desconto de 5% por litro 
	    
	    Gasolina: 
	    
	    c. até 20 litros, desconto de 4% por litro 
	    d. acima de 20 litros, desconto de 6% por litro Escreva um 
	    algoritmo que leia o número de litros vendidos, o tipo de 
	    combustível (codificado da seguinte forma: A-álcool, G- gasolina), 
	    calcule e imprima o valor a ser pago pelo cliente sabendo-se que o 
	    preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90. 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de litros vendidos:");
		double litros = scan.nextDouble();

		System.out.println("Entre com o tipo de combustível:");
		String tipo = scan.next();

		double precoGasolina = 2.50;
		double precoAlcool = 1.90;
		int percentualDesconto = 0;
		double total = 0;
		double totalDesconto = 0;

		if (tipo.equalsIgnoreCase("A")) {

			if (litros <= 20) {
				percentualDesconto = 3;
			} else {
				percentualDesconto = 5;
			}

			total = litros * precoAlcool;

		} else if (tipo.equalsIgnoreCase("G")) {

			if (litros <= 20) {
				percentualDesconto = 4;
			} else {
				percentualDesconto = 6;
			}

			total = litros * precoGasolina;

		}

		totalDesconto = (total / 100) * percentualDesconto;

		double precoAPagar = total - totalDesconto;

		System.out.println("Valor a ser pago: " + precoAPagar);

		scan.close();
	}

}
