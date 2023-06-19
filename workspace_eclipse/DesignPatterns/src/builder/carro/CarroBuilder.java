package builder.carro;

/*
 * @autor dimitri.leone
 * @since 30.05.2023
 */

public class CarroBuilder {

private Carro carro;
	
	public CarroBuilder() {
		this.carro = new Carro();
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	public void buildMotor(Motor m) {
		carro.setM(m);
	}
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setCb(cb);
	}
	public void buildFreioABS(FreioABS f) {
		carro.setF(f);
	}
	

	
	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}
	
	
	private boolean validarPortas() {
		if (carro.getPortas() == null || 
				(carro.getPortas().length != 2 && carro.getPortas().length != 4)
				){
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