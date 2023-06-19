package builder.carro;

/*
 * @autor dimitri.leone
 * @since 30.05.2023
 */

public class CarroBuilderFluente {

	private Carro carro;
	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public CarroBuilderFluente buildPortas(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}
	
	public CarroBuilderFluente buildMotor(Motor m) {
		carro.setM(m);
		return this;
	}
	
	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
		carro.setCb(cb);
		return this;
	}
	
	public CarroBuilderFluente buildFreioABS(FreioABS f) {
		carro.setF(f);
		return this;
	}
	
	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}
	
	
	private boolean validarPortas() {
		if (carro.getPortas() == null || 
				(carro.getPortas().length != 2 && carro.getPortas().length != 4)
				) {
			throw new IllegalArgumentException("Número de Portas Inválido!");
		} else {
			return true;
		}
	}
	
	
	private boolean validarMotor() {
		if (carro.getM() == null ) {
			throw new IllegalArgumentException("Carro Sem Motor!");
		} else {
			return true;
		}
	}
	
}
	