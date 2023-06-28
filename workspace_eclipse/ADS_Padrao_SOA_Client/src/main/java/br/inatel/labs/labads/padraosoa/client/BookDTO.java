package br.inatel.labs.labads.padraosoa.client;

/*
 * @autor dimitri.leone
 * @since 27.06.2023
 */

public class BookDTO {

	private Long id;
	private String title;
	private String category;
	
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
