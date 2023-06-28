package br.inatel.labs.labads.padraosoa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.inatel.labs.labads.padraosoa.model.service.BookService;
import br.inatel.labs.labads.padraosoa.model.entity.Book;

/*
 * @autor dimitri.leone
 * @since 27.06.2023
 */

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookService service;
	
	
	@GetMapping
	public List<Book> getAllBooks() {
		List<Book> books = service.searchBook();
		return books;
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable("id") Long bookId) {
		Optional<Book> opBook = service.findBookById(bookId);
		
		if(opBook.isPresent()) {
			Book book = opBook.get();
			return book;
		
		} else {
			String msgErro = "No book found by id: " + bookId;
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, msgErro);
		}
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Book postBook(@RequestBody Book newBook) {
		Book createdBook = service.createBook(newBook);
		return createdBook;
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void putBook(@RequestBody Book book) {
		service.updateBook(book);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBookById(@PathVariable("id") Long bookId) {
		Optional<Book> opBook = service.findBookById(bookId);
		
		if(opBook.isPresent()) {
			Book book = opBook.get();
			service.delete(book);

		} else {
			String errorMsg = "No Book found by id: " + bookId;
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, errorMsg);
		}
	}
}
