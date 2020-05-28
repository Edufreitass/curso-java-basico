package com.loiane.cursojava.aula13;

public class Operadores {

	// Conceitos
	
	/**
	 * Operadores:
	 * - Operadores Aritméticos
	 * - Operadores Relacionais
	 * - Operadores Lógicos
	 * - Operadores de Assignment
	 * - Precedência
	 * 
	 * O que são Operadores?
	 * - Símbolos que solicitam ao compilador realizar alguma operação.
	 * 
	 * OPERADORES ARITMÉTICOS
	 * 		Operador		Descrição
	 * 			+			adição(e mais unário)
	 * 			-			subtração(e menos unário)
	 * 			*			multiplicação
	 * 			/			divisão
	 * 			%			módulo(resto da divisao)
	 * 			++			incremento(pós ou pré fix)
	 * 			--			decremento(pós ou pré fix)
	 * 
	 * Exemplos:
	 * 		int resultado = 1 + 2;
	 * 		System.out.println(resultado);
	 * 
	 * 		resultado = resultado - 1;
	 * 		System.out.println(resultado);
	 * 
	 * 		resultado = resultado * 2;
	 * 		System.out.println(resultado);
	 * 
	 * 		resultado = resultado / 2;
	 * 		System.out.println(resultado);
	 * 
	 * 		resultado = resultado + 8;
	 * 
	 * 		resultado = resultado % 7;
	 * 		System.out.println(resultado);
	 * 
	 * Exemplo de Concatenação utilizando o operador de adição(+):
	 * 		String primeiraString = "Esta é";
	 * 		String segundaString = " uma String concatenada.";
	 * 		String terceiraString = primeiraString + segundaString;
	 * 		System.out.println(terceiraString);
	 * 
	 * Exemplo utilizando incremento e decremento:
	 * 		resultado = +1;
	 * 		System.out.println(resultado);
	 * 
	 * 		resultado--;
	 * 		System.out.println(resultado);
	 * 
	 * 		resultado++;
	 * 		System.out.println(resultado);
	 * 
	 * 		resultado = -resultado;
	 * 		System.out.println(resultado);
	 * 
	 * 		boolean success = false;
	 * 		System.out.println(success);
	 * 		System.out.println(!sucess);
	 * 
	 * Outro exemplo de incremento(++) e decremento(--):
	 * 		int i = 3;
	 * 		i++;
	 * 		// output 4
	 * 		System.out.println(i);
	 * 		i++;
	 *		// output 5
	 * 		System.out.println(i);
	 * 		// output 6
	 * 		System.out.println(++i);
	 * 		// output 6
	 * 		System.out.println(i++);
	 * 		// output 7
	 * 		System.out.println(i);
	 * 
	 * OPERADORES RELACIONAIS
	 * 		Operador		Descrição
	 * 			==			igual a
	 * 			!=			diferente de
	 * 			>			maior que
	 * 			<			menor que
	 * 			>=			maior ou igual que
	 * 			<=			menor ou igual que
	 * 
	 * - Observação: O operador "=" unico, é um operador de ATRIBUIÇÃO!
	 * 
	 * OPERADORES LÓGICOS
	 * 		Operador		Descrição
	 * 			&			AND
	 * 			|			OR
	 * 			^			XOR
	 * 			||			OR curto circuito
	 * 			&&			AND curto circuito
	 * 			!			NOT
	 * 
	 * TABELA VERDADE
	 * 		a				b				a & b			a | b			a ^ b			!a
	 * 		FALSO			FALSO			Falso			Falso			Falso			Verdadeiro
	 * 		VERDADEIRO		FALSO			Falso			Verdadeiro		Verdadeiro		Falso
	 * 		FALSO			VERDADEIRO		Falso			Verdadeiro		Verdadeiro		Verdadeiro
	 * 		VERDADEIRO		VERDADEIRO		Verdadeiro		Verdadeiro		Falso			Falso
	 * 		
	 * PRECEDÊNCIA
	 * 		Operador				Precedência
	 * 
	 * 		postfix						expr++ expr--
	 * 		unário						++expr --expr +expr -expr ~ !
	 * 		multiplicativo				* / %
	 * 		aditivo						+ -
	 * 		shift						<< >> >>>
	 * 		relacional					< > <= >= instanceof
	 * 		igualdade					== !=
	 * 		bitwise AND					&
	 * 		bitwise exclusivo OR		^
	 * 		bitwise inclusivo OR		|
	 * 		lógico AND					&&
	 * 		lógico OR					||
	 * 		ternário					? :
	 * 		assignment					= += -= *= /= %= &= ^= |= <<= >>=
	 * 
	 */
	
}
