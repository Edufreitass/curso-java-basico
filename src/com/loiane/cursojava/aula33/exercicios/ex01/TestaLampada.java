package com.loiane.cursojava.aula33.exercicios.ex01;

public class TestaLampada {

	/*
	 * 1) Escreva uma classe para representar uma lâmpada. Desenvolva métodos para
	 * ligar, desligar a lampada.
	 */
	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();

		lampada.mostrarEstado();

		lampada.desligar();

		lampada.mostrarEstado();

		lampada.mudarEstado();

		lampada.mostrarEstado();

	}

}
