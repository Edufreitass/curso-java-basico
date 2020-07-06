package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("João");

		// relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua José Chaves");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Rio de Janeiro");
		end.setEstado("RJ");
		end.setCep("999999");

		contato.setEndereco(end);

		// relacionamento tem-um telefone
		Telefone tel = new Telefone();
		tel.setTipo("celular");
		tel.setDdd("21");
		tel.setNumero("99999-9999");

		Telefone tel2 = new Telefone();
		tel2.setTipo("casa");
		tel2.setDdd("11");
		tel2.setNumero("87777-2323");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;

		contato.setTelefones(telefones);

		// Teste saída no console
		System.out.println(contato.getNome());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}

		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
