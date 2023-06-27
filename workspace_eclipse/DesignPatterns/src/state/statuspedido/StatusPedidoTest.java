package state.statuspedido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * @autor dimitri.leone
 * @since 13.06.2023
 */

class StatusPedidoTest {

	@Test
	void dadoStatusINICIAL_quandoAvancar_entaoStatusAtualSeraPAGO() {
		StatusPedido status = StatusPedido.INICIAL;
		
		StatusPedido statusAtual = status.avancar();
		StatusPedido statusEsperado = StatusPedido.PAGO;
		
		assertEquals(statusAtual, statusEsperado);
	}

}
