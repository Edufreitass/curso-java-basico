package com.loiane.cursojava.aula11;

public class Piadinha {

	public static void main(String[] args) {

		int Oct31 = 031;
		
		int Dec25 = 25;
		
		/*
	    31 base 8
	    25 base 10
	  
	    (31)8 = (25)10
		Solução Passo-a-Passo
		Passo 1: Escreva o número octal:
		
		31
		Passo 2: Multiplique cada dígito ao número octal pela potência de oito correspondente:
		
		3x81 + 1x80
		Passo 3: Resolva as potências:
		
		3x8 + 1x1
		Passo 4: Some os números escritos acima:
		
		24 + 1 = 25
		
		Este é o equivalente decimal ao número octal 31.
		 */
		
		// 31 em octal é igual ao 25 em decimal
		System.out.println(Oct31 == Dec25);
	}

}
