package com.loiane.cursojava.aula34.exercicios.ex01;

public class TestaContador {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	/*
	 * 1) Escreva uma classe chamada Contador, que tem um atributo estático que é
	 * incrementado sempre que a classe for instanciada. Crie métodos para zerar,
	 * incrementar e retornar o valor do contador. Desenvolva um programa para
	 * testar essa classe.
	 */
	public static void main(String[] args) {

		imprimirValor();
		
		Contador.incrementar();

		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimirValor();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValor();
	}

}
