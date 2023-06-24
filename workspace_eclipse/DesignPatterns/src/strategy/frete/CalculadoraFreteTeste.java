package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * @autor dimitri.leone
 * @since 05.06.2023
 */

class CalculadoraFreteTeste {

	@Test
	void deveCalcularFreteParaDHL() {
		Fretavel servicoFreteDHL = new ServicoFreteDHL();
		double pesoEmKg = 70.00;
		double valorRetornado = servicoFreteDHL.calcularValor(pesoEmKg);
		
		assertEquals(90.00, valorRetornado);
	}
	
	@Test
	void deveCalcularParaFedEx() {
		Fretavel servicoFreteFedEx = new ServicoFreteFedEx();
		double pesoEmKg = 60.00;
		double valorRetornado = servicoFreteFedEx.calcularValor(pesoEmKg);
		
		assertEquals(75.00, valorRetornado);
	}
	
	@Test
	void deveCalcularFreteParaJadLog() {
		Fretavel servicoFreteJadLog = new ServicoFreteJadLog();
		double pesoEmKg = 85.00;
		double valorRetornado = servicoFreteJadLog.calcularValor(pesoEmKg);
		
		assertEquals(150.00, valorRetornado);
	}
	
	@Test
	void deveCalcularFreteParaSedex() {
		Fretavel servicoFreteSedex = new ServicoFreteSedex();
		double pesoEmKg = 100.00;
		double valorRetornado = servicoFreteSedex.calcularValor(pesoEmKg);
		
		assertEquals(90.00, valorRetornado);
	}
	

}

