package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class Break {

	// Comando break
	// - Usado para saída de loops.
	// - Pode ser usado juntamente com um rótulo(label).

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		System.out.println("Entre com um limite");
		int max = scan.nextInt();

		// o primeiro numero divisivel por 7 que esteja entre num e max
		for (int i = num; i <= max; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}

		scan.close();

	}

}
