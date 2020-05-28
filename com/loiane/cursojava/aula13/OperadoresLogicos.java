package com.loiane.cursojava.aula13;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 é 2 - resultado: "+ resultado1); // output true
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2 - resultado: "+ resultado2); // output true
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso); // output false
		System.out.println(verdadeiro || falso); // output true
		System.out.println(verdadeiro ^ falso); // output true
		System.out.println(!verdadeiro && falso); // output false
		
		
	}

}
