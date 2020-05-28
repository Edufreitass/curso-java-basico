package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado); // output 3
		
		resultado = resultado - 1;
		System.out.println(resultado); // output 2
		
		resultado = resultado * 2;
		System.out.println(resultado); // output 4
		
		resultado = resultado / 2;
		System.out.println(resultado); // output 2
		
		resultado = resultado + 8;
		System.out.println(resultado); // output 10
		
		resultado = resultado % 7;
		System.out.println(resultado); // output 3
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		// imprime = Esta é uma String concatenada.
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;;
		System.out.println(resultado); // output 4
		
		resultado++;
		System.out.println(resultado); // output 5
		
		 // primeiro imprime o valor do resultado e depois adiciona +1 a ele
		System.out.println(resultado++); // output 5
		// mesma coisa que
//		System.out.println(resultado);
//		resultado = resultado + 1;
//		resultado += 1; // mesma coisa que (resultado = resultado + 1 ou resultado++)
		
		// primeiro adiciona +1 ao resultado e depois imprime ela, o inverso da situação anterior
		System.out.println(++resultado); // output 7
		// mesma coisa que
//		resultado += 1;
//		System.out.println(resultado);
		
		
//		resultado += 1;
//		System.out.println(resultado); // output 6
		
		resultado--;
		System.out.println(resultado); // output 6
		
		System.out.println(resultado--); // output 6
		System.out.println(--resultado); // output 4
		
	}

}
