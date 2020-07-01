package com.loiane.cursojava.aula11;

public class SequenciaEscape {

	public static void main(String[] args) {
		
		// "Hello, World!" INCLUINDO AS ASPAS ""
		System.out.println("\"Hello, World!\"");
		
		// "Hello, World!" PULANDO UMA LINHA USANDO print
		System.out.print("\"Hello, World!\"\n");
		
		// "Hello, World!" PULANDO UMA LINHA USANDO print E FAZENDO UM RETORNO DE CARRO
		System.out.print("\"Hello, World!\"\n\r");

		// 1\4 INCLUINDO A BARRA INVERTIDA NO OUTPUT
		System.out.println("1\\4");
		
	}

}
