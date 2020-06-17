package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * 3) Faça um programa que leia e valide as seguintes informações: 
		 a. Nome: maior que 3 caracteres; 
		 b. Idade: entre 0 e 150; 
		 c. Salário: maior que zero; 
		 d. Sexo: 'f' ou 'm'; 
		 e. Estado Civil: 's', 'c', 'v', 'd'; 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// validador iniciado como false, para validar as condições abaixo..
		boolean infoValida = false;

		// 1) Criar variaveis referentes as informaçoes que serao solicitadas!
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		// faça isso...
		do {

			System.out.println("Entre com o nome:");
			nome = scan.nextLine();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo 3 caracteres.");
			}
			// enquanto o validador for igual a false
		} while (!infoValida);

		// muda o estado do validador para false novamente, ja que na
		// condição anterior caso ela fosse válida, ela viraria true!
		infoValida = false;
		do {
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com o salario:");
			salario = scan.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0.");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com o sexo(m - f):");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'.");
			}
		} while (!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com o estado civil:");
			estadoCivil = scan.next();
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
			}
		} while (!infoValida);

		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

		scan.close();
	}
}