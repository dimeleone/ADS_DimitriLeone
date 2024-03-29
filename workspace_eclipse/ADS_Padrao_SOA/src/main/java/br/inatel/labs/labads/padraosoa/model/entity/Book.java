package br.inatel.labs.labads.padraosoa.model.entity;

/*
 * @autor dimitri.leone
 * @since 27.06.2023
 */

public class Book {

	private Long id;
	private String title;
	private String category;
	
	//Construtor
	public Book(Long id, String title, String category) {
		this.id = id;
		this.title = title;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
