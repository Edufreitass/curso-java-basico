package com.loiane.cursojava.aula27;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	// método com parametro
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
