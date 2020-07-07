package com.loiane.cursojava.aula46.exercicios.ex03;

public class Cubo extends Figura3D {

	// lado == aresta
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return 6 * (lado * lado);
	}

	@Override
	public double calcularVolume() {
		return lado * lado * lado;
//		return Math.pow(lado, 3);
	}

}
