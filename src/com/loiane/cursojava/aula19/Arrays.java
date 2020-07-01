package com.loiane.cursojava.aula19;

public class Arrays {

	// Arrays
	// - Estrutura de dados mais simples existente
	// na maioria das linguagens de programação.
	// Lista ordenada de dados.

	// Problema ! ! !
	// Armazenar a temperatura média diária por 1 ano.

	// Solução?
	// Utilizar arrays, vetores.
	// Semelhante a uma planilha de Excel.

	public static void main(String[] args) {

		// NÃO FAÇA ISSO!
		// Solução: utilize arrays para armazenar muitos valores
		/*
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		*/

		// BOA PRÁTICA, declarar o tipo da variavel e logo em seguida o array[]
		// double[] celsius;

		// MÁ PRÁTICA
		// double fahrenheit[];

		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;

		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]); // 33.7

		System.out.println("O tamanho do array: " + temperaturas.length); // 365

		System.out.println("Valores do array: ");

		// versão padrão do for, para fazer a ITERAÇÃO do array
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
		}

		// versão melhorada do for(foreach), para fazer LEITURAS do array
		// "double temp" é igual a "temperaturas[i]"
		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
