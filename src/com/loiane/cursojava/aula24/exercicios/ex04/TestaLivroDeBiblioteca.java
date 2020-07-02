package com.loiane.cursojava.aula24.exercicios.ex04;

import java.util.Date;

public class TestaLivroDeBiblioteca {

	/*
	 * 4) Usando o resultado do modelo “Livro” como base, crie uma classe
	 * “LivroDeBiblioteca” que represente os dados básicos de um livro de uma
	 * biblioteca, que pode ser emprestado a leitores.
	 */
	public static void main(String[] args) {

		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.nome = "OCP Oracle Certified Professional Java SE 11 Programmer I Exam Fundamentals 1Z0-815";
		livro.autor = "Hanumant Deshmukh";
		livro.anoLancamento = 2019;

		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Eduardo";

		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Nome do autor: " + livro.autor);
		System.out.println("Ano do lançamento: " + livro.anoLancamento);

		System.out.println("O livro está emprestado? " + livro.emprestado);
		System.out.println("Quem retirou o livro? " + livro.emprestadoA);

	}

}
