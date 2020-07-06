package com.loiane.cursojava.aula36;

public class Contato {

	// Relacionamento entre Classes (tem um e tem muitos)

	private String nome;

	// Relacionamento - OneToOne
	// Contato tem um Endereco
	private Endereco endereco;

	// Relacionamento - OneToMany
	// Contato tem muitos telefones
	private Telefone[] telefones;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

}
