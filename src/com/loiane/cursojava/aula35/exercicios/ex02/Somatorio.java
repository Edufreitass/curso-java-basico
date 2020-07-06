package com.loiane.cursojava.aula35.exercicios.ex02;

public class Somatorio {

	// Somatório de 5 = 5 + 4 + 3 + 2 + 1
	// Somatório de 4 = 4 + 3 + 2 + 1
	// Somatório de 3 = 3 + 2 + 1
	// Somatório de 2 = 2 + 1
	// Somatório de 1 = 1

	public static int somatorio(int num) {

		if (num == 1) {
			return 1;
		}

		return num + somatorio(num - 1);
	}

}
