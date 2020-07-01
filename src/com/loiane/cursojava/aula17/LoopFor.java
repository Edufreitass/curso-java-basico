package com.loiane.cursojava.aula17;

public class LoopFor {
	
	// Conceitos
	/**
	 * Comando for
	 * - Executa um bloco de código que está dentro do comando for enquando uma expressão for verdadeira.
	 * - Muuuito utilizado na programação.
	 * Exemplo:
	 * 		for (inicialização: condição; atualização) {
	 * 			// bloco de código
	 * 		}
	 * 
	 * 		for (int i = 0: i < 5; i++) {
	 * 			System.out.println("i tem valor: " + i);
	 * 		}
	 * 
	 * - for com mais de uma variável
	 * Exemplo:
	 * 		for (int i = 0, j = 10; i < j; i++, j--) {
	 * 			System.out.println("i tem valor: " + i + " e j tem valor: " + j);
	 * 		{
	 * 
	 * - partes ausentes
	 * Exemplo:
	 * 		int i = 0;
	 * 		for ( ; i < 5 ; ) {
	 * 			System.out.println("i tem valor: " + i);
	 * 			i++;
	 * 		}
	 * 
	 * - loop infinito
	 * Exemplo:
	 * 		for ( ; ; );
	 * 
	 * - loop sem corpo
	 * Exemplo:
	 * 		int soma = 0;
	 * 		for (i = 1; i < 5; soma += i++);
	 *		System.out.println("O valor da soma é: " + soma);
	 *
	 *- loop melhorado
	 * Muito utilizado com Arrays
	 *  		
	 */

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		System.out.println("--------------");
		
		for (int i = 5; i > 0; i--) {
			System.out.println("i tem valor: " + i);
		}
		
		System.out.println("--------------");
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		System.out.println("--------------");
		
		int count = 0;
		for ( ; count < 10; ) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		System.out.println("--------------");
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("valor de cont: " + cont);
		}
		
		System.out.println("--------------");
		
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma é " + soma);
		
		System.out.println("--------------");
		
		for (int i = 0; i < 5; i++)
			System.out.println("i tem valor: " + i);
		
	}
	
}
