package com.loiane.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {

		Object obj1 = obterString();
		// downcasting permitido, pois o metodo "obterString()" retorna uma String
		String s1 = (String) obj1; // downcasting

		Object obj2 = "Minha String"; // upcasting
		// downcasting permitido pois ele faz referencia diretamente a uma String
		String s2 = (String) obj2; // downcasting

		Object obj3 = new Object();
		// downcasting não permitido, pois obj3 nao faz referencia a uma String
		String s3 = (String) obj3; // downcasting
		
		Object obj4 = obterInteiro();
		// Exception in thread "main" java.lang.ClassCastException
		String s4 = (String) obj4;

		// Downcasting só funciona quando se faz referencia a um tipo particular
		
	}

	public static String obterString() {
		return "minha String";
	}

	public static int obterInteiro() {
		return 1;
	}

}
