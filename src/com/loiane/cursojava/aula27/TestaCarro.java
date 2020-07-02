package com.loiane.cursojava.aula27;

public class TestaCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducatu";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);

		van.exibirAutonomia();

		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());

		// chamando métodos com parametros
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);

	}

}
