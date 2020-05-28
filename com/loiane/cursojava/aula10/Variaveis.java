package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// Declaração de variaveis
		
		// int = numero inteiro
		int idade;
		int idade1 = 20;
		// String = conjunto, coleção de caracteres
		String nome;
		String nome1 = "Eduardo";
		String nomeDoMeuCachorro = "Feroz";
		String ano2020 = "2020";
		
		idade1 = 23;

		System.out.println("Idade = " + idade1);
		System.out.println("Nome = " + nome1);
		
		// aceito, mas não utilizado
		int _idade;
		int $idade;
		
		// não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		// má prática
		int a = 10;
		String b = "Loiane";
		// O que "a" significa? E "b"? Não sei o que isso significa.
		// É recomendado sempre dar nomes as variaveis, para que seja fácil a leitura do código.
		
	}

}
