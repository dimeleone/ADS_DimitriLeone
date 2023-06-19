package builder.carro;

/*
 * @autor dimitri.leone
 * @since 30.05.2023
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CarroBuilderTest {

	@Test
	void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		
		//Partes Válidas
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		
		//Invocando CarroBuilder
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordoSiemens);
		builder.buildFreioABS(freioBosch);
		Carro carroPronto = builder.getCarro();
		
		
		//Validando Carro
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getM());
		assertNotNull(carroPronto.getPortas());
		assertTrue(carroPronto.getPortas().length == 2);
		assertNotNull(carroPronto.getCb());
		assertNotNull(carroPronto.getF());
		
	}
	
	
	@Test
	void dadoPortasInvalidas_quandoGetCarro_entaoException() {
		
		//Partes Válidas
		Motor motorVTEC = new Motor();
		Porta[] portas = {};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		
		//Invocando Builder
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordoSiemens);
		builder.buildFreioABS(freioBosch);
		
		
		//Validando Carro
		try {
			builder.getCarro();
			fail();
		} catch (Exception e) {
			}
	}
	
	
	@Test
	void dadoSemMotor_quandoGetCarro_entaoException() {
		
		//Partes Válidas
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		
		//Invocando Builder
		CarroBuilder builder = new CarroBuilder();
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordoSiemens);
		builder.buildFreioABS(freioBosch);
		
		
		//Validando Carro
		try {
			builder.getCarro();
			fail();
		} catch (Exception e) {
			}	
	}

}