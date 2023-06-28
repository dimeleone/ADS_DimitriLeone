package br.inatel.labs.labads.padraosoa.client;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/*
 * @autor dimitri.leone
 * @since 27.06.2023
 */

public class WebClientGetBookById {

	public static void main(String[] args) {
		
		Mono<BookDTO> monoBook = WebClient.create("http://localhost:8080")
				.get()
				.uri("/book/1")
				.retrieve()
				.bodyToMono(BookDTO.class);
		
		monoBook.subscribe();
		
		BookDTO dto = monoBook.block();
		
		System.out.println(dto);
	}
}
