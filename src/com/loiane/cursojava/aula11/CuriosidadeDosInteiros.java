package com.loiane.cursojava.aula11;

public class CuriosidadeDosInteiros {

	public static void main(String[] args) {

		// Uma entrevista de emprego de Java, existe uma pergunta de PEGADINHA!
		
		int var1 = 2147483647; // valor maximo de um inteiro (2147483647)
		
		int var2 = 1;
		
		// O que será que acontece com essa soma?
		System.out.println(var1 + var2);
		// Imprime "-2147483648", ou seja, NÃO acontece nenhum erro!
		
		// Explicação:
		// -2147483648 valor minimo de um inteiro
		
		// -2147483648 valor imprimido
		
		// Por que?
		// Os números no Java funcionam como uma ROLETA, ou seja, o proximo valor nessa roleta
		// depois que o limite é excedido, vai ser o MENOR valor!
		
	}

}
