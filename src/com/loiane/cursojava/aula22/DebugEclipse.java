package com.loiane.cursojava.aula22;

public class DebugEclipse {

	// Conceitos
	/**
	 * DEBUG
	 * 
	 * Quando utilizar o debug?
	 * - Utilize quando você encontrar um erro no seu programa, assim 
	 * você será capaz de descobrir aonde se localiza tal erro.
	 *
	 * Breakpoint
	 * - Ponto no qual você deseja parar a execução do programa,
	 * para fazer a análise do que está acontecendo.
	 * 
	 * Step Into (F5)
	 * - Serve para debugar as classes com métodos.
	 * 
	 * Step Over (F6)
	 * - Server para passar de uma linha para outra.
	 * 
	 */
	public static void main(String[] args) {

		int[] notas = new int[3];

		for (int i = 0; i < 4; i++) {
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
			notas[i] = i;
		}

	}

}
