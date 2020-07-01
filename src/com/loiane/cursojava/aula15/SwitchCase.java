package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	//Conceitos
	
	/**
	 * Comandos Switch - Case 
	 * - Funciona como múltiplos If-Else
	 * 
	 * Java > 7
	 * - Até Java 7 a condição podia ser byte, short, int, char ou Enum
	 * - Com Java 7 o switch também aceita String
	 */

	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um dia da semana (1-7):");
		int diaSemana = scan.nextInt();

		/*
		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Terça");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Não é um dia da semana válido");
		}
		*/

//		switch(diaSemana) {
//		case 1: 
//			System.out.println("Domingo");
//			break;
//		case 2: 
//			System.out.println("Segunda");
//			break;
//		case 3: 
//			System.out.println("Terça");
//			break;
//		case 4: 
//			System.out.println("Quarta");
//			break;
//		case 5: 
//			System.out.println("Quinta");
//			break;
//		case 6: 
//			System.out.println("Sexta");
//			break;
//		case 7: 
//			System.out.println("Sábado");
//			break;
//		default:
//			System.out.println("Não é um dia da semana válido");
//		}
		
		/*
		// Sintaxe da Loiane
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sábado"); break;
		default:System.out.println("Não é um dia da semana válido");
		}
		*/
		
		/*
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); 
		case 2: System.out.println("Segunda"); 
		case 3: System.out.println("Terça"); 
		case 4: System.out.println("Quarta"); 
		case 5: System.out.println("Quinta"); 
		case 6: System.out.println("Sexta");
		// caso digite 1, o programa irá parar por aqui, imprimindo Sábado e todos os dias anteriores a ele
		case 7: System.out.println("Sábado"); break; 
		default:System.out.println("Não é um dia da semana válido");
		}
		*/
		
		// Caso seja entre 2 a 6, imprima "Dia útil"
		switch(diaSemana) {
		case 2: 
		case 3:  
		case 4: 
		case 5:  
		case 6: System.out.println("Dia útil"); break;
		// Caso seja 7 ou 1, imprima "Fim de semana"
		case 1: 
		case 7: System.out.println("Fim de semana"); break;
		// Caso seja um valor inválido, imprima "Não é um dia..."
		default:System.out.println("Não é um dia da semana válido");
		}
		
		scan.close();
		
	}
	
}
