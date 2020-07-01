package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio13 {

  /*
    13) Faça um Programa que pergunte quanto você ganha por hora e o 
    número de horas trabalhadas no mês. Calcule e mostre o total do 
    seu salário no referido mês, sabendo-se que são descontados 
    11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
    faça um programa que nos dê:

    a. salário bruto.
    b. quanto pagou ao INSS.
    c. quanto pagou ao sindicato.
    d. o salário líquido.
    e. calcule os descontos e o salário líquido, conforme a tabela abaixo:

    + Salário Bruto : R$
    - IR (11%) : R$
    - INSS (8%) : R$
    - Sindicato (5%) : R$
    = Salário Liquido : R$

    Obs.: Salário Bruto - Descontos = Salário Líquido
  */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre o valor/hora");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double impostoRenda = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + impostoRenda;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Imposto de Renda: " + impostoRenda);
		System.out.println("Total de Descontos: " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
		
		scan.close();
	}
	
}
