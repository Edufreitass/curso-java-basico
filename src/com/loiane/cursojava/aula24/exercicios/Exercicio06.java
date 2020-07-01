package com.loiane.cursojava.aula24.exercicios;

public class Exercicio06 {

	// 6) Crie uma classe que represente um contato da agenda do seu celular.
	public static void main(String[] args) {

		Contato contato1 = new Contato();
		contato1.nome = "João";
		contato1.endereco = "Av Paulista, 1000";
		contato1.email = "joao@email.com";

		contato1.telefones = new String[5];
		contato1.telefones[0] = "98877-1010";
		contato1.telefones[1] = "95544-1040";
		contato1.telefones[2] = "91011-1020";

	}

}
