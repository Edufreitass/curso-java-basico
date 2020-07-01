package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	/*
	15) Faça um Programa que peça os 3 lados de um triângulo. O programa 
	deverá informar se os valores podem ser um triângulo. Indique, caso 
	os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou 
	escaleno. 
    - o Dicas: 
    - o Três lados formam um triângulo quando a soma de quaisquer
    dois lados for maior que o terceiro; 
    - o Triângulo Equilátero: três lados iguais; 
    - o Triângulo Isósceles: quaisquer dois lados iguais; 
    - o Triângulo Escaleno: três lados diferentes;
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o  lado01:");
		int lado01 = scan.nextInt();

		System.out.println("Entre com o  lado02:");
		int lado02 = scan.nextInt();

		System.out.println("Entre com o  lado03:");
		int lado03 = scan.nextInt();

		if ((lado01 + lado02) > lado03) {
            if (lado01 == lado02 && lado01 == lado03 && lado02 == lado03) {
                System.out.println("Triângulo Equilátero");
            } else if (lado01 == lado02 || lado02 == lado03 || lado01 == lado03) {
                System.out.println("Triângulo Isósceles");
            } else if (lado01 != lado02 && lado01 != lado03 && lado02 != lado03) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Isso não é um Triângulo!");
        }

		scan.close();
	}
	
	   /*
    Se o primeiro lado e o segundo lado do triângulo for maior que o 3:
    #Agora o programa tenta descobrir o tipo triângulo
    – Se todos os lados forem iguais – O triângulo é um Equilátero
    – Se 2 quaisquer lados (l1 e l2 ou l2 e l3, etc) forem iguais – Isósceles
    – Se Todos os lados forem diferentes – Triângulo Escale

    Caso o primeiro lado e o segundo lado do triângulo for maior que o 3 o todos
    os lados não podem ser um Triângulo.
    
    Saídas:
    >>>
    Digite o tamanho do primeiro lado: 5
    Digite o segundo lado: 5
    Digite o segundo lado: 2
    Triângulo Isósceles
    >>>
    
    >>>
    Digite o tamanho do primeiro lado: 5
    Digite o segundo lado: 8
    Digite o segundo lado: 9
    Triângulo Escaleno
    >>>
    
    >>>
    Digite o tamanho do primeiro lado: 8
    Digite o segundo lado: 8
    Digite o segundo lado: 8
    Triângulo Equilátero
    >>>
    
    >>>
    Digite o tamanho do primeiro lado: 2
    Digite o segundo lado: 2
    Digite o segundo lado: 10
    É impossível ser um triângulo
    >>>
     */
	
}
