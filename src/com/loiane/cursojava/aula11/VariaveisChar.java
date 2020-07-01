package com.loiane.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {

//		char o = 'o';
//		char i = 'i';
		
		// imprime "216", é preciso transformar isso para char
//		System.out.println(o + i);
		
		// imprime "oi", pois usamos aspas duplas vazias e concatenamos com os char existentes
//		System.out.println("" + o + i);
		
		// neste caso ocorrera uma soma, caso voce nao utilize "" antes de concatenar os valores
		char o = 111;
		char i = 105;
		
		// unicode
		char interrogacao = '\u003F'; // valor = '?'
		
		// imprime "216", é preciso transformar isso para char
		System.out.println(o + i);
		
		// imprime "oi", pois usamos aspas duplas vazias e concatenamos com os char existentes
		System.out.println("" + o + i);
		
		// imprime "oi?"
		System.out.println("" + o + i + interrogacao);
		
	}

}
