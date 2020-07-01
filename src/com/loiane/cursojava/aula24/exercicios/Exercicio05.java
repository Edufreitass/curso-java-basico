package com.loiane.cursojava.aula24.exercicios;

public class Exercicio05 {

	/*
	 * 5) Cria uma classe para representar uma conta corrente que possui um número,
	 * um saldo, um status que informa se ela é especial ou não, um limite.
	 */
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.numero = "123456";
		cc.agencia = "321";
		cc.especial = true;
		cc.limiteEspecial = 500;
		cc.saldo = -10;

		System.out.println("Saldo da conta Nº " + cc.numero + " = " + cc.saldo);

	}

}
