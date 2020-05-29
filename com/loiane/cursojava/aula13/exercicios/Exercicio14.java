package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	/*
	 * 14) Faça um programa que peça o tamanho de um arquivo para download (em MB) e
	 * a velocidade de um link de Internet (em Mbps), calcule e informe o tempo
	 * aproximado de download do arquivo usando este link (em minutos).
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre o tamanho do arquivo para download:");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velInternet = scan.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo de download: " + tempo);
		
		scan.close();
	}
	
}
