package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		// Classe para input de dados via teclado, utilizando o console da IDE
		Scanner scan = new Scanner(System.in);
		
		/*
		// Leitura de uma linha inteira
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		// Leitura de um tipo de dado especifico, faz a leitura apenas do primeiro nome
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next(); // Tome cuidado ao utilizar next()
		System.out.println("Seu primeiro nome é " + primeiroNome);
		
		
		// Leitura de um inteiro
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é " + idade);
		
		// Tome cuidado com a configuração do seu SO, pois pode
		// ser que ele aceite ponto ou virgula para separar as casas decimais
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);
		*/
		
		// Leitura de varios dados
		System.out.println("Digite o seu primeiro nome, idade, altura e se voce é Flamenguista: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		boolean eFlamenguista = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Você é Flameguista? " + eFlamenguista);
		
		scan.close();
		
	}

}
