package com.loiane.cursojava.aula16;

public class LoopWhile {

	// Conceitos
	/**
	 * Comando While
	 * - Esse comando avalia uma expressão e caso verdadeira executa o bloco dentro do comando while.
	 * 
	 * Comando do-while
	 * - Esse comando executa o bloco dentro do comando do e depois avalia a expressão. 
	 * O bloco deixa de ser executado após a expressão ficar falsa.
	 */
	
	public static void main(String... args) {
	
		int i = 1; // count ou cont
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		// enquanto - 1° avalia a expressão e depois executa o bloco de código
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; 		ou 		i += 1;
		}
		
		System.out.println(i); // valor de 11
		
		// faça, enquanto - 1° executa o bloco de código e depois avalia a expressão
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
		
	}
	
}
