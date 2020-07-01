package com.loiane.cursojava.aula13;

public class CurtoCircuito {
	
	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		// output false, esse & verifica as duas condições
		boolean resultado1 = falso &
				verdadeiro;
		
		// output false, falso de qualquer maneira,
		// pois neste caso o && verifica que a primeira condição
		// é false, entao a segunda ele NÃO VERIFICA e imprime FALSE
		boolean resultado2 = falso &&
				verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		// 1 + 1 - 1 + 1 * 1 / 1
		
		// 1° passo: 1 * 1 = 1
		
		// 2° passo: 1 / 1 = 1
		
		// 3° passo: 1 + 1 = 2
		
		// 4° passo: 2 - 1 = 1
		
		// 5° passo: 1 + 1 = 2
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
		
	}
	
}
