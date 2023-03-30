package familia;

import org.junit.Test;

/*
 * @autor dimitri.leone
 * @since 29.03.2023
 */

public class FamiliaTest {

	@Test
	public void imprimir() {
		
		System.out.println("> Nome:");
		System.out.println(Pai.nome);
		System.out.println(Filha.nome);
		System.out.println(Neta.nome);
		
		System.out.println("> Residência:");
		System.out.println(Pai.residencia);
		System.out.println(Filha.residencia);
		System.out.println(Neta.residencia);
		
		System.out.println("> Olhos:");
		System.out.println(Pai.olhos);
		System.out.println(Filha.olhos);
		System.out.println(Neta.olhos);
		
	}
}
