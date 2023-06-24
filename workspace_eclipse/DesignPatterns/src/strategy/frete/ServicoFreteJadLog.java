package strategy.frete;

/*
 * @autor dimitri.leone
 * @since 05.06.2023
 */

public class ServicoFreteJadLog implements Fretavel {
	
	@Override
	public double calcularValor(double pesoEmKg) {
		if(pesoEmKg < 30.00) {
			return 0.00;
			
		} else 
			return 150.00;
	}
	
}
