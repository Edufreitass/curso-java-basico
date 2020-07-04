package com.loiane.cursojava.aula33.exercicios.ex02;

public class TestaContaCorrente {

	/*
	 * 2) Cria uma classe para representar uma conta corrente que possui um número,
	 * um saldo, um status que informa se ela é especial ou não, um limite.
	 * Desenvolva métodos para realizar saque (verificando se o cliente pode
	 * realizar saques), despositar dinheiro, consultar saldo e verificar se o
	 * cliente está usando cheque especial ou não. Desenvolva um programa para
	 * testar essa classe.
	 */
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.setNumero("123456");
		cc.setAgencia("321");
		cc.setEspecial(true);
		cc.setLimiteEspecial(500);
		cc.setSaldo(-10);

		System.out.println("Saldo da conta " + cc.getNumero() + " = " + cc.getSaldo());

		boolean saqueEfetuado = cc.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			cc.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}

		saqueEfetuado = cc.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			cc.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}

		System.out.println("Depósito de 500 reais");
		cc.depositar(500);
		cc.consultarSaldo();

		if (cc.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}

		saqueEfetuado = cc.realizarSaque(600);
		cc.consultarSaldo();
		if (cc.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}

	}

}
