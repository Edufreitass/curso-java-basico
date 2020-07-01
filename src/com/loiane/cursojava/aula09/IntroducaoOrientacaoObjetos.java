package com.loiane.cursojava.aula09;

public class IntroducaoOrientacaoObjetos {

	// Conceitos
	
	/*
	 * CLASSE = Descrição de um grupo de objetos.
	 * 
	 * - Nome da classe
	 * - Conjunto de atributos (descrição)
	 * - Conjunto de métodos (comportamento)
	 * 
	 * Do momento em que instanciamos um objeto, ou seja,
	 * o objeto seria a instancia da classe,
	 * a classe seria apenas uma descrição,
	 * o objeto é como se voce tivesse dando vida a classe.
	 * 
	 * Exemplo:
	 * Vamos supor que iremos construir uma casa, contratamos um engenheiro ou arquiteto,
	 * para fazer a planta da casa. A planta da casa contem todas as descrições da casa no papel,
	 * então ela sera sua classe. Do momento que voce começa a construir a casa, ela se torna um objeto,
	 * ou seja, ela é uma instancia daquilo que estava no papel (planta). 
	 * 
	 * HERANÇA = Permite reutilização da estrutura e do comportamento de uma classe.
	 * 
	 * - Herda características de outros objetos
	 * Exemplo:
	 * Todo CANINO ou FELINO são MAMIFEROS, herdam caracteristicas de mamiferos.
	 *
	 * POLIMORFISMO = Habilidade de variáveis terem "mais de um tipo".
	 * 
	 * O polimorfismo é voltado a comportamento, ações.
	 * 
	 * Exemplo:
	 * O cachorro, gato, lobo, tigre emitem som, ou seja, um ANIMAL emite um som.
	 * Ou seja, um animal tem um comportamento de emitir um som.
	 * 
	 * Emitir som:
	 * Cachorro: late
	 * Gato: mia
	 * Vaca: berra
	 * Cobra: sibila
	 * Lobo: ruiva
	 */
	
	/*
	 * Java: pacotes(packages)
	 * 
	 * - Forma de organizar suas classes
	 * 
	 * - Convenção: dominio + projeto + pasta
	 * Ex: com.loiane.cursojava.aula09
	 */
	
}

// Classe
class Cachorro {
	
	// Atributos (caracteristicas)
	String raca;
	long altura;
	double peso;
	String temperamento;
	String nivelDeAtividade;
	String tempoDeVida;
	String inteligencia;
	
	// Método (Comportamento, Ação)
	public void comportamentoCanino() {
		
		// Todas essas palavras são VERBOS, elas indicam AÇÕES!
		
		/*
		 * Latir
		 * Passear
		 * Comer
		 * Dormir
		 * Treinar
		 * Brincar
		 * Ter filhotes
		 */
	}
	
}
