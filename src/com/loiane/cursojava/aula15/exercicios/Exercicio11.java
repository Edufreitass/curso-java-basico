package com.loiane.cursojava.aula15.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

	/*
	11) As Organizações Tabajara resolveram dar um aumento de salário aos 
	seus colaboradores e lhe contraram para desenvolver o programa que 
	calculará os reajustes. 
	- o Faça um programa que recebe o salário de um colaborador e o 
	reajuste segundo o seguinte critério, baseado no salário atual: 
	- o salários até R$ 280,00 (incluindo) : aumento de 20% 
	- o salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
	- o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
	- o salários de R$ 1500,00 em diante : aumento de 5% 
	- Após o aumento ser realizado, informe na tela: 
	- o salário antes do reajuste; 
	- o percentual de aumento aplicado; 
	- o valor do aumento; 
	- o novo salário, após o aumento.
	*/
	public static void main(String... args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		double salario = scan.nextDouble();
		
		int percentual = 0;
		if (salario <= 280) {
			percentual = 20;
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		} else if (salario >= 1500) {
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Salário: " + salario);
		System.out.println("Percentual: " + percentual);
		System.out.println("Aumento: " + new DecimalFormat("#,##0.00").format(aumento));
//		System.out.println("Aumento: " + new DecimalFormat("0.00").format(aumento));
//		System.out.println("Aumento: " + aumento);
		System.out.println("Salário ajustado: " +  new DecimalFormat("#,##0.00").format(salarioAjustado));
//		System.out.println("Salário ajustado: " +  new DecimalFormat("0.00").format(salarioAjustado));
//		System.out.println("Salário ajustado: " + salarioAjustado);
		
		/*
		Here are a few examples, formatted using a UK Locale:

		Pattern		Number		Formatted String
		###.###		123.456		123.456
		###.#		123.456		123.5
		###,###.##	123456.789	123,456.79
		000.###		9.95		009.95
		##0.###		0.95		0.95
		*/
		
		/*
		 // Correção da Loiane
		public static void main(String[] args){
        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Digite o salário:");
	        double salario = scan.nextDouble();
	        
	        int percentual = 0;
	        if (salario <= 280){
	            percentual = 20;
	        } else if (salario > 280 && salario < 700){
	            percentual = 15;
	        } else if (salario >= 700 && salario < 1500){
	            percentual = 10;
	        } else if (salario >= 1500){
	            percentual = 5;
	        }
	        
	        double aumento = (salario / 100) * percentual;
	        double salarioAjustado = salario + aumento;
	        
	        System.out.println("Salário: " + salario);
	        System.out.println("Percentual: " + percentual);
	        System.out.println("Aumento: " + aumento);
	        System.out.println("Salário ajustado: " + salarioAjustado);
    	}
		*/
		scan.close();
	}
	
}
