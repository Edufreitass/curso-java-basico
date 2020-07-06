package com.loiane.cursojava.aula34.exercicios.ex02;

public class TestaCalculadora {

	/*
	 * 2) Escreva uma classe Calculadora que tenha os seguintes métodos: somar,
	 * subtrair, multiplicar, dividir (dois números), elevar à potência n.
	 * Desenvolva um programa para testar essa classe.
	 */
	public static void main(String[] args) {

		imprimirTela(Calculadora.somar(1, 1));
		imprimirTela(Calculadora.subtrair(6, 2));
		imprimirTela(Calculadora.multiplicar(2, 4));
		imprimirTela(Calculadora.dividir(10, 2));
		imprimirTela(Calculadora.potencia(2, 3));

	}

	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
