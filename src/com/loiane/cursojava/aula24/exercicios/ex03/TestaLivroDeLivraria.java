package com.loiane.cursojava.aula24.exercicios.ex03;

public class TestaLivroDeLivraria {

	/*
	 * 3) Usando o resultado do exercício anterior como base, crie uma classe
	 * “LivroDeLivraria” que represente os dados básicos de um livro que está à
	 * venda em uma livraria.
	 */
	public static void main(String[] args) {

		LivroDeLivraria livro = new LivroDeLivraria();
		livro.nome = "OCP Oracle Certified Professional Java SE 11 Programmer I Exam Fundamentals 1Z0-815";
		livro.autor = "Hanumant Deshmukh";
		livro.anoLancamento = 2019;
		livro.preco = 127.86;

		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Nome do autor: " + livro.autor);
		System.out.println("Ano do lançamento: " + livro.anoLancamento);
		System.out.println("Preço do livro: " + livro.preco);

	}

}
