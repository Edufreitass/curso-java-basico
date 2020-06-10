package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	// 4) Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra em minusculo:");
		String letra = scan.next();

		// 1ª forma
		/* 
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        }
        */

		// Se tiver mais de uma letra, imprime...
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
			// 2ª forma
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
				break;
			}
		}

		scan.close();
	}

}
