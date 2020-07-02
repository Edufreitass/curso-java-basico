package com.loiane.cursojava.aula24.exercicios.ex02;

public class TestaLivro {

	// 2) Crie uma classe Livro que represente os dados básicos de um livro, sem se
	// preocupar com a sua finalidade.
	public static void main(String[] args) {

		Livro livro = new Livro();
		livro.nome = "OCP Oracle Certified Professional Java SE 11 Programmer I Exam Fundamentals 1Z0-815";
		livro.autor = "Hanumant Deshmukh";
		livro.anoLancamento = 2019;

		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Nome do autor: " + livro.autor);
		System.out.println("Ano do lançamento: " + livro.anoLancamento);

	}

}
