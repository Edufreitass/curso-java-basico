package com.loiane.cursojava.aula34.exercicios.ex01;

public class Contador {

	private static int cont;

	// outra forma de incrementar
	public Contador() {
		cont++;
	}

	public static void incrementar() {
		cont++;
	}

	public static void zerar() {
		cont = 0;
	}

	public static int obterValor() {
		return cont;
	}

}
