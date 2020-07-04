package com.loiane.cursojava.aula31;

public class Carro {

	// público, é visível a todas a classes desse projeto
	public String marca;
	// package default, só é visível para classes do mesmo pacote
	String modelo;
	int numPassageiros;
	double capCombustivel;
	// privado, só é visível dentro da própria classe
	private double consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
	}

	public double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	// método auxiliar
	private double divideKmPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombustivel(km);
	}

}
