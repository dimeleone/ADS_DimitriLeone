package esporte;

/*
 * @autor dimitri.leone
 * @since 29.03.2023
 */

public class Pessoa extends Object {

	String nome;
	
	Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	void envelhecer() {
		this.idade++;
	}
}
