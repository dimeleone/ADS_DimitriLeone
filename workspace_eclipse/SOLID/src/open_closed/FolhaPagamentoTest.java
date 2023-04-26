package open_closed;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 * @autor dimitri.leone
 * @since 26.04.2023
 */


public class FolhaPagamentoTest {

	private static final Object ContratoCLT = null;

	@Test
	void testCalcular() {
		ContratoCLT contratoCLT = new ContratoCLT(1000.0);
		Estagio estagio = new Estagio(500.0);
		
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		folhaPagamento.calcular(ContratoCLT);
		folhaPagamento.calcular(estagio);
		
		Double valorEsperado = 1500.0;
		Double valorAtual = folhaPagamento.getTotalFolha();
		assertEquals(valorEsperado, valorAtual);
	}
	
}
