package com.loiane.cursojava.aula20;

public class Matriz {

	// Conceitos
	
	// Parte 1: Introdução e Prática
	// Parte 2: Manipulação
	// Parte 3: Matrizes 3 dimensões
	// Parte 4: Matrizes Irregulares
	
	/**
	 *  Matriz
	 *  - Array = lista de 'n' elementos
	 *  - Matriz = tabela de 'n' x 'm' elementos
	 *  - Matriz == array de arrays
	 *  
	 *  Problema
	 *  - Armazenar as 4 notas do ano de 30 alunos.
	 *  
	 *  Solução?	   NÃO!!!
	 *  double[] aluno1 = new double[4];
	 *  double[] aluno2 = new double[4];
	 *  double[] aluno3 = new double[4];
	 *  double[] aluno4 = new double[4];
	 *  double[] aluno5 = new double[4];
	 *  
	 *  Solução?	   SIM!!!
	 *  		  notas
	 *  		1	A	B	C	D
	 *  alunos  2	10	7	8	9.5
	 *  		3	9	8	7	9
	 *  		4	8	9	10	7
	 *  		5	5	8	7	8.5
	 *  
	 *  aluno x notas		[0]	[1]	[2]	[3]
	 *  				[0]	10	7	8	9.5
	 *  				[1]	9	8	7	9
	 *  				[2]	8	9	10	7
	 *  				[3]	7	10	7.5	8
	 *  				[4]	5	8	7	8.5
	 *  
	 *  No Java seria feito da seguinte forma:
	 *  
	 *  // 30 linhas e 4 colunas
	 *  double[][] notasAlunos = new double[30][4];
	 *  
	 *  notasAlunos[0][0] = 10;				[0]	[1]	[2]	[3]
	 *  notasAlunos[0][1] = 7;			[0]	10	7	8	9.5
	 *  notasAlunos[0][2] = 8;			[1]	9	8	7	9
	 *  notasAlunos[0][3] = 9.5;			[2]	8	9	10	7
	 *  								[3]	7	10	7.5	8
	 *  notasAlunos[1][0] = 9;			[4]	5	8	7	8.5
	 *  notasAlunos[1][1] = 8;
	 *  notasAlunos[1][2] = 7;
	 *  notasAlunos[1][3] = 9;
	 *  
	 *  - Array de arrays
	 *  double[][] notasAlunos2 = {{ 10, 7, 8, 9.5}, {9, 8, 7, 9}};
	 */
	
}
