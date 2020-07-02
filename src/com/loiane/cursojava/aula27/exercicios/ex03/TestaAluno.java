package com.loiane.cursojava.aula27.exercicios.ex03;

import java.util.Scanner;

public class TestaAluno {

	/*
	 * 3) Escreva uma class para representar um Aluno. Adicione atributos
	 * relacionados às caracteristicas de um Aluno, como nome, matricula, curso que
	 * está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3
	 * disciplinas. Desenvolva um método para verificar se o aluno está aprovado
	 * (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa
	 * para testar essa classe, que pede as informações do aluno ao usuário e ao
	 * final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi
	 * aprovado ou não.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno");
		aluno.nome = scan.next();

		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = scan.next();

		System.out.println("Entre com a matricula");
		aluno.matricula = scan.next();

		// aluno.nomeDisciplinas = new String[3];
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + i);
			aluno.nomeDisciplinas[i] = scan.next();
		}

		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - foi aprovado.");
				System.out.println("Média final: " + aluno.obterMedia(i));
			} else {
				System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " - foi reprovado!");
				System.out.println("Média final: " + aluno.obterMedia(i));
			}
		}

		scan.close();

	}

}
