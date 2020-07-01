package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	/*
	 20) Faça um programa que faça 5 perguntas para uma pessoa sobre um 
	 crime. As perguntas são: 
	    . "Telefonou para a vítima?" 
	    a. "Esteve no local do crime?" 
	    b. "Mora perto da vítima?" 
	    c. "Devia para a vítima?" 
	    d. "Já trabalhou com a vítima?" 
	    O programa deve no final emitir uma classificação sobre a participação
	    da pessoa no crime. Se a pessoa responder positivamente a 2 questões 
	    ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
	    e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente". 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Telefonou para a vítima?");
		String resp1 = scan.next();

		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();

		System.out.println("Mora perto da vítima");
		String resp3 = scan.next();

		System.out.println("Devia para a vítima?");
		String resp4 = scan.next();

		System.out.println("Já trabalhou com a vítima?");
		String resp5 = scan.next();

		int contador = 0;

		if (resp1.equalsIgnoreCase("S")) {
			contador++;
		}

		if (resp2.equalsIgnoreCase("S")) {
			contador++;
		}

		if (resp3.equalsIgnoreCase("S")) {
			contador++;
		}

		if (resp4.equalsIgnoreCase("S")) {
			contador++;
		}

		if (resp5.equalsIgnoreCase("S")) {
			contador++;
		}

		if (contador == 2) {
			System.out.println("Suspeita");
		} else if (contador == 3 || contador == 4) {
			System.out.println("Cúmplice");
		} else if (contador == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}

		scan.close();

	}

}
