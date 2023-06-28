package br.inatel.labs.labads.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;
import br.inatel.labs.labads.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;

/*
 * @autor dimitri.leone
 * @since 27.06.2023
 */

@Service
public class BookService {

	private List<Book> bookList = new ArrayList<>();
	public List<Book> searchBook() {
		return bookList;
	}
	
	@PostConstruct
	private void setup() {
		Book b1 = new Book(1L, "Delphin Blanco", "Contos");
		Book b2 = new Book(2L, "Python com Matemática", "Programação");
		Book b3 = new Book(3L, "Cozinha Mineira", "Gastronomia");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
	
	public Optional<Book> findBookById(Long id) {
		Optional<Book> opBook = bookList.stream()
				.filter(b -> b.getId().equals(id))
				.findFirst();
		
		return opBook;
	}
	
	public Book createBook(Book newBook) {
		Long idGerado = new Random().nextLong();
		newBook.setId(idGerado);
		bookList.add(newBook);
		return newBook;
	}
	
	public void updateBook(Book book) {
		bookList.remove(book);
		bookList.add(book);
	}
	
	public void delete(Book book) {
		bookList.remove(book);
	}
}
