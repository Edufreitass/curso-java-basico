package com.loiane.cursojava.aula52.exercicio;

public class ContatoNaoExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	@Override
	public String getMessage() {
		return "Contato " + nomeContato + " não existe na agenda!";
	}

}
