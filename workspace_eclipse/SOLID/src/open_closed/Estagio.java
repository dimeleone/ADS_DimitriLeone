package open_closed;

/*
 * @autor dimitri.leone
 * @since 26.04.2023
 */

public class Estagio {

	private Double bolsaAuxilio;
	
	public Estagio(Double bolsaAuxilio) {
		super();
		this.bolsaAuxilio = bolsaAuxilio;
	}
	
	public Double getBolsaAuxilio() {
		return bolsaAuxilio;
	}
}

//Refatorando depois:
/*
public class Estagio implements Remuneravel {

	public double getRemuneracao(){
		return this.getBolsaAuxilio();
}
*/