package loiane.groner.aula07;

public class Erro03 {

	// Tipos de Erros
	// Exemplos:
	// - Erros de Sintaxe = Esquecer de fechar um parênteses, chaves, ponto-virgula ou alguma outra coisa, acontece um erro de sintaxe.
	// - Erros de Semântica = Tentar declarar uma variavel do jeito que o Java não esteja esperando.
	// - Erros de Tempo de Execução = Criar uma classe e esquecer o método MAIN
	
	// Erro de Tempo de Execução
	// Método "main" com "M" maiusculo, compila, porem na execução causará ERRO!
//	public static void Main(String[] args) {	
	public static void main(String[] args) {

		// Compila, mas a divisão por ZERO, causara ERRO em TEMPO DE EXECUÇÃO, lançando uma ArithmeticException
		System.out.println("Você digitou: " + 1/0);
	
	}
}
