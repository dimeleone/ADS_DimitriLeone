package state.artigo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * @autor dimitri.leone
 * @since 13.06.2023
 */

class ArtigoTest {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		//1. Rascunho > Revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertEquals("REVISANDO", artigo.getEstado());
		
		
		//2. Revisando > Aprovado
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertEquals("APROVADO", artigo.getEstado());
		
		
		//Imprime o histórico
		artigo.getLogHistorico().forEach(System.out::println);
		
	}
	
	
	//DESAFIO
	@Test
	void deveArtigoTransitarDeRascunho_Revisando_Rascunho() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		Artigo artigo = new Artigo();
		
		//1. Rascunho > Revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		
		//2. Revisando > Rascunho
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		
		//Imprime o histórico
		artigo.getLogHistorico().forEach(System.out::println);
	}

}
