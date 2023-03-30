package esporte;

import org.junit.Test;

/*
 * @autor dimitri.leone
 * @since 29.03.2023
 */


public class AtletaTest {

	@Test
	void testarConstrutor() {
		
		Pessoa pessoaEdson = new Pessoa("Edson", 21);
		
		System.out.println(pessoaEdson.nome);
		System.out.println(pessoaEdson.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 21, 80, false);
		
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
	}

	@Test
	void testarNadador() {
		
		Nadador nadador = new Nadador("Gustavo", 35, 90, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
	}

	@Test
	void testarCiclista() {
		Ciclista ciclista = new Ciclista("Tiago", 44, 85, false);
		System.out.println("Está aposentado");
		if (ciclista.aposentado) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
		ciclista.pedalar();
		ciclista.envelhecer();
		ciclista.aposentar();
		System.out.println("Agora já está aposentado?");
		System.out.println(ciclista.aposentado ? "Sim" : "Não");
	}

}





