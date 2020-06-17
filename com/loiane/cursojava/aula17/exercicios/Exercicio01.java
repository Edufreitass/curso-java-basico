package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 *  1) Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
		 mensagem caso o valor seja inválido e continue pedindo até que o 
		 usuário informe um valor válido. 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1) Pedir ao usuario uma nota entre 0 e 10
		System.out.println("Entre com uma nota entre (0-10)");
		double nota = scan.nextDouble();
		
		// 2) Criar um laço para exibir uma mensagem ao usuario,
		// caso o valor seja inválido.
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida, digite novamente:");
			nota = scan.nextDouble();
		}
		
		// 3) Imprimir a nota
		System.out.println("Você digitou a nota " + nota);
		
		scan.close();
	}
	
	// Correção da Loiane
	/*
	 public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        // flag
        boolean notaValida = false;
        
        do {
           
            System.out.println("Entre com uma nota");
        
            double nota = scan.nextDouble();

            if (nota >=0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Nota inválida, digite novamente.");
            }
            
        } while (!notaValida);
        
     }
	 */

}
