package com.loiane.cursojava.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

	// herança multipla entre INTERFACES é permitido no Java,
	// já entre CLASSES NÃO é permitido, diferente do C++
	
	void abriConexao();
	void fecharConexao();
	
}
