package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class Continue {

	// Comando continue
	// - Complemento o break.
	// - Continue o loop na próxima iteração.

	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		System.out.println("Entre com um limite");
		int max = scan.nextInt();

		// NÃO imprime os numeros divisiveis por 7 que esteja entre num e max
		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}

		scan.close();

	}

}
