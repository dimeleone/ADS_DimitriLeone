package br.inatel.labs.labads.padraosoa.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/*
 * @autor dimitri.leone
 * @since 27.06.2023
 */

public class WebClientUpdateBook {

	public static void main(String[] args) {
		
		BookDTO existingBook = new BookDTO();
		existingBook.setId(3L);
		existingBook.setTitle("Cozinha Mineira na Fazenda");
		existingBook.setCategory("Gastronomia regional");
		
		Mono<ResponseEntity<Void>> monoVoid = WebClient.create("http://localhosto:8080")
				.put()
				.uri("/book")
				.bodyValue(existingBook)
				.retrieve()
				.toBodilessEntity();
		
		monoVoid.subscribe();
		
		ResponseEntity<Void> responseEntity = monoVoid.block();
		
		System.out.println(responseEntity.getStatusCode());
	}
}
