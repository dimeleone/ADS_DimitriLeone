package strategy.frete;

/*
 * @autor dimitri.leone
 * @since 05.06.2023
 */

public class CalculadoraFrete {

	public double calcularValor(Fretavel fretavel, double pesoEmKg) {
		
		double valor = fretavel.calcularValor(pesoEmKg);
		return valor;
	}
		
}
	