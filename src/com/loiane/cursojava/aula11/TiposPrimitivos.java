package com.loiane.cursojava.aula11;

public class TiposPrimitivos {

	// Conceitos
	
	// Obs: Java não é uma linguagem 100% orientado a objetos, Ruby sim, é 100% OO.
	
	/**
	 * Tipos Primitivos
	 * - boolean
	 * - Números:
	 * 		Inteiro: byte, short, int, long, char
	 * 		Ponto Flutuante: float, double
	 * 
	 * - Inteiros:
	 * 		byte (tamanho = 8 bits)		 (Intervalo de Valores = -128 a 127)
	 * 			short (tamanho = 16 bits)	 (Intervalo de Valores = -32.768 a 32.767)
	 * 				int (tamanho = 32 bits)		 (Intervalo de Valores = -2.147.483.648 a 2.147.483.647)
	 * 					long (tamanho = 64 bits) 	 (Intervalo de Valores = -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
	 * 
	 * 		byte idade1 = 20;
	 * 		short idade2 = 20;
	 * 		int idade3 = 20;
	 * 		long idade4 = 20;
	 * 
	 * - Ponto Flutuante:
	 * 		float (tamanho = 32 bits)
	 * 			double (tamanho = 64 bits)
	 * 
	 * 		float saldo1 = 100.30f;
	 * 		double saldo2 = 100.30;
	 * 
	 * Char:
	 * 		char o = 'o';
	 * 		char i = 'i';
	 * 
	 * ASCII:
	 * 		char o = 111;
	 * 		char i = 105;
	 * 		System.out.prinln("" + o + i);
	 * 
	 * Unicode:
	 * 		char o = 111;
	 * 		char i = 105;
	 * 		char interrogacao = '\u003F';
	 *		System.out.println("" + o + i + interrogacao);
	 * 
	 * Boolean:
	 * 		boolean verdadeiro = true;
	 * 		boolean falso = false;
	 * 
	 * Literais:
	 * 		int idade1 = 20;
	 * 		long idade2 = 20l;
	 * 
	 * 		double d1 = 123.4;
	 * 		// mesmo valor que d1, mas em notação científica
	 * 		double d2 = 1.234e2;
	 * 		float f1 = 123.4f;
	 * 
	 * Literais: Hexadecimais, Octais, Binários
	 * 		int decVal = 26;
	 * 		int hexVal = 0x1a;
	 * 		int octVal = 032;
	 * 		int binVal = 0b11010; // JDK 7
	 * 
	 * Literais: Pode e não pode // JDK 7
	 * 
	 * 	PODE:
	 * 		long creditCardNumber = 1234_5678_9012_3456L;
	 * 		long cpf = 101_134_156_68L;
	 * 		float pi = 3.14_15F;
	 * 		long hexBytes = 0xFF_EC_DE_5E;
	 * 		long hexWords = 0xCAFE_BABE;
	 * 		long maxLong = 0x7fff_ffff_ffff_ffffL;
	 * 		byte nybbles = 0b0010_0101;
	 * 		long bytes = 0b11010010_01101001_10010100_10010010;
	 * 	
	 * 	NÃO PODE:
	 * 		// Não pode colocar underscore perto de ponto
	 * 		float pi1 = 3_.1415F;
	 * 		// Não pode colocar underscore perto de ponto
	 * 		float pi2 = 3._1415F;
	 * 		// Não pode colocar underscore perto de sufixos (L)
	 * 		long cpf = 101_134_156_68_L;
	 * 		
	 * 		// Identificador, não é literal
	 * 		int x1 = _52;
	 * 		// OK (decimal literal)
	 * 		int x2 = 5_2;
	 * 		// Não pode colocar underscore no final de um literal
	 * 		int x3 = 52_;
	 * 		// OK (decimal literal)
	 * 		int x4 = 5________2;
	 * 		
	 * 		// Não pode colocar underscore perto de prefixos (0x)
	 * 		int x5 = 0_x52;
	 * 		// Não pode colocar underscore no começo de números
	 * 		int x6 = 0x_52;
	 * 		// OK (hexadecimal literal)
	 * 		int x7 = 0x5_2;
	 * 		// Não pode colocar underscore no final de números
	 * 		int x8 = 0x52_;
	 * 
	 * Escape - char(formatação)
	 * 		SEQUÊNCIA DE ESCAPE		Descrição
	 *		\t							tab
	 * 		\b							backspace
	 * 		\n							nova linha
	 * 		\r							retorno de carro
	 * 		\f							avanço de página
	 * 		\'							aspas simples
	 * 		\"							aspas duplas
	 * 		\\							barra invertida
	 * 		\ddd						constante octal
	 * 		\\uxxxx						constante hexadecimal (NÃO utiliza \\, o correto é \ apenas)
	 * 		
	 */
	
}
