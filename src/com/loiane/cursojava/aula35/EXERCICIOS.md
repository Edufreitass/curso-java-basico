# [Curso Java Basico] Exercícios  de  Java
# Aula  35  –  OO  –  Métodos  Recursivos
***
	1) Escreva  um  método  recursivo  e  estático  que  calcule  e  retorne  o  N-­‐ésimo
	termo  da  sequência  Fibonacci.  	Alguns  números  desta  sequência  são:
	0,  1,   1,  2,  3,  5,  8,  13,  21,  34,  55,  89...
***
	2) Escreva  um  método  recursivo  e  estático  que  receba  um  número  inteiro
	   positivo  N  e  calcule  o  somatório  	dos  números  de  1  a  N
***
### Conceitos
 
#### Função/Método recursivo
- Método que chama ele mesmo
- Precisa de um ponto de parada

- Exemplo: 
	- Fatorial de 5! = 5 *4 * 3 * 2 * 1 = 120

```java
// Método NÃO recursivo
public int calculaFatorial(int num) {
	int total = 1;
	for (int i = num; i > 1; i--) {
		total *= i;
	}
	return total;
}
```

```java
// Método RECURSIVO
public int fatorial(int num) {
	// ponto de parada
	if (num == 0) {
		return 1;
	}
	// chama ele mesmo
	return num * fatorial(num - 1);
}
```

[Link do curso](https://www.youtube.com/playlist?list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r)
