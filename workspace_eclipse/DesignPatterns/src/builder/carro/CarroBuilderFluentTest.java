package builder.carro;

/*
 * @autor dimitri.leone
 * @since 30.05.2023
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarroBuilderFluentTest {

	@Test
	void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		
		//Partes Válidas
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		
		//Invocando CarroBuilderFluente
		Carro carroPronto = new CarroBuilderFluente()
		.buildPortas(portas)
		.buildMotor(motorVTEC)
		.buildComputadorBordo(computadorBordoSiemens)
		.buildFreioABS(freioBosch)
		.getCarro();
		
		
		//Validando Carro
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getM());
		assertNotNull(carroPronto.getPortas());
		assertTrue(carroPronto.getPortas().length == 2);
		assertNotNull(carroPronto.getCb());
		assertNotNull(carroPronto.getF());
	
		}
	
}
