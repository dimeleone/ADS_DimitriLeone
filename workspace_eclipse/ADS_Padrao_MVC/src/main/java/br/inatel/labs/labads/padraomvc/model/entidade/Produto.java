package br.inatel.labs.labads.padraomvc.model.entidade;

/*
 * @autor dimitri.leone
 * @since 19.06.2023
 */

public class Produto {

	private Long id;
	private String descricao;
	private Double preco;
	
	public Produto(Long id, String descricao, Double preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}
	
	
}
