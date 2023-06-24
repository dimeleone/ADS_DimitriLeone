package strategy.frete;

/*
 * @autor dimitri.leone
 * @since 05.06.2023
 */

public class ServicoFreteFedEx implements Fretavel {

	@Override
	public double calcularValor(double pesoEmKg) {
		if(pesoEmKg < 20.00) {
			return 0.00;
			
		} else if(pesoEmKg < 40.00) {
			return 45.00;
			
		} else
			return 75.00;
	}
}
