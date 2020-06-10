package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	// 7) Faça um Programa que leia três números e mostre o maior e o menor deles.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo nuemro:");
		int num2 = scan.nextInt();

		System.out.println("Entre com o terceiro numero:");
		int num3 = scan.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("num1 é maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("num2 é maior: " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("num3 é maior: " + num3);
		}

		if (num1 <= num2 && num1 <= num3) {
			System.out.println("num1 é menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("num2 é menor: " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("num3 é menor: " + num3);
		}

		scan.close();
	}

}
