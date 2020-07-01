package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	/* 
	8) Faça um Programa que pergunte quanto você ganha por hora e o 
	número de horas trabalhadas no mês. Calcule e mostre o total do seu
	salário no referido mês.
	*/
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe quantas horas você trabalhou: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("Você receberá neste mês: " + salario);
		
		scan.close();
	}
	
	/*
	// Correção da Loiane Groner
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre o valor/hora");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salario é de: " + salario);
		
		scan.close();
	}
	*/
	
}
