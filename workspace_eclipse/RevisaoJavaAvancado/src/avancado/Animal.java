package avancado;

/*
 * @autor dimitri.leone
 * @since 03.04.2023
 */

public class Animal implements Comparable<Animal>{

	private Long id;
	private String nome;
	public Animal(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public int compareTo(Animal that) {
		return this.nome.compareTo(that.nome);
	}
}
